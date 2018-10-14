package com.greenfoxacedemy.bank.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableGlobalMethodSecurity(securedEnabled = true)
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Bean
  public UserDetailsService userDetailsService() {
    return super.userDetailsService();
  }

  @Qualifier("accountServiceImpl")
  @Autowired
  private UserDetailsService userService;

//  public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
//    authenticationManagerBuilder
//        .userDetailsService(userService)
//        .passwordEncoder(passwordEncoder());
//  }
//
//  @Bean
//  public BCryptPasswordEncoder passwordEncoder() {
//    return new BCryptPasswordEncoder();
//  }


  @Autowired
  public void configureAuth(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(userService);

//    auth
//        .inMemoryAuthentication()
//        .withUser("daruu")
//        .password("{noop}12345")
//        .roles("USER")
//        .and()
//        .withUser("admin")
//        .password("{noop}12345")
//        .roles("ADMIN");
  }

  protected void configure(HttpSecurity http) throws Exception {

    http.cors().and().csrf().disable()
        .authorizeRequests()
          .antMatchers("/admin/**").hasRole("ADMIN")
          .antMatchers("/register").permitAll()
          .antMatchers("/register").permitAll()
          .anyRequest().authenticated()
        .and()
          .formLogin()
          .loginPage("/login")
          .permitAll()
        .and()
          .logout()
          .logoutSuccessUrl("/login?logout")
          .permitAll();

  }
}
