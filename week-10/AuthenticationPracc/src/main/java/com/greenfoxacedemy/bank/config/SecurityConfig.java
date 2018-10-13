package com.greenfoxacedemy.bank.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableGlobalMethodSecurity(securedEnabled = true)
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {


  @Autowired
  public void configureAuth(AuthenticationManagerBuilder auth) throws Exception {

    auth
        .inMemoryAuthentication()
          .withUser("daruu")
          .password("{noop}12345")
          .roles("USER")
        .and()
          .withUser("admin")
          .password("{noop}12345")
          .roles("ADMIN");
  }
  protected void configure(HttpSecurity httpSec) throws Exception{

    httpSec
        .authorizeRequests()
          .antMatchers(HttpMethod.GET,"/")
          .permitAll()
          .antMatchers("/users").hasAnyRole("ADMIN")
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
