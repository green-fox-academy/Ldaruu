package com.greenfoxacademy.googleauth.security;

import org.springframework.beans.factory.annotation.Value;
import com.greenfoxacademy.googleauth.models.User;
import com.greenfoxacademy.googleauth.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.autoconfigure.security.oauth2.resource.AuthoritiesExtractor;
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;


@Configuration
@EnableOAuth2Sso
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {



  @Autowired
  UserRepository userRepository;

  private static final String GOOGLE_PLUS_DOMAIN_ATTRIBUTE = "gmail.com";

  @Bean
  public PrincipalExtractor principalExtractor(UserRepository userRepository) {
    return map -> {
      String principalId = (String) map.get("id");
      User user = userRepository.findByPrincipalId(principalId);
      if (user == null) {
        LOGGER.info("No user found, generating profile for {" + principalId + "}");
        user = new User();
        user.setPrincipalId(principalId);
        user.setCreated(LocalDateTime.now());
        String email = (String) map.get("email");
        if (!email.endsWith("@gmail.com")) {
          return null;
        }
        user.setEmail((String) map.get("email"));
        user.setFullName((String) map.get("name"));
        user.setPhoto((String) map.get("picture"));
        user.setLastLogin(LocalDateTime.now());
      } else {
        user.setLastLogin(LocalDateTime.now());
      }
      userRepository.save(user);
      return user;
    };
  }

  @Bean
  public GoogleAuthoritiesExtractor authoritiesExtractor(
      @Value("#{'${ALLOWED_DOMAIN}'.split(',')}")
      final List<String> allowedDomains) {

    return new GoogleAuthoritiesExtractor() {
      @Override
      public List<GrantedAuthority> extractAuthorities(final Map<String, Object> map) {
        if (map != null && map.containsKey(GOOGLE_PLUS_DOMAIN_ATTRIBUTE)) {
          final String domain = (String) map.get(GOOGLE_PLUS_DOMAIN_ATTRIBUTE);
          if (!allowedDomains.contains(domain)) {
            throw new BadCredentialsException("Not an allowed domain");
          }
          return AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");
        }
        return null;
      }
    };
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
        .csrf()
        .disable()
        .antMatcher("/**")
        .authorizeRequests()
        .antMatchers("/", "/index.html", "/main")
        .permitAll()
        .anyRequest()
        .authenticated();
  }

}