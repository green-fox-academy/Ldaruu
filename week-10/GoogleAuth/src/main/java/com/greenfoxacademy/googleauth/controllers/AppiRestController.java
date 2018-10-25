package com.greenfoxacademy.googleauth.controllers;

import com.greenfoxacademy.googleauth.models.User;
import com.greenfoxacademy.googleauth.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AppiRestController {

  @Autowired
  UserRepository userRepository;

  @GetMapping("/users")
  public List<User> getUsers(User user) {
    return (List<User>) userRepository.findAll();
  }

  @GetMapping("/user")
  public Principal getPrincipalUser(Principal principal) {
    return principal;
  }
  @RequestMapping("/user")
  public Object user(OAuth2Authentication authentication) {
    LinkedHashMap<String, Object> properties = (LinkedHashMap<String, Object>) authentication.getUserAuthentication().getDetails();
    return properties.get("email");
  }

  @RequestMapping("/foo")
public void handleFoo(HttpServletResponse response, OAuth2Authentication authentication) throws IOException {
    LinkedHashMap<String, Object> properties = (LinkedHashMap<String, Object>) authentication.getUserAuthentication().getDetails();
    String email = (String) (properties.get("email"));
    if (email.endsWith("gmail.com")) {
      response.setHeader("main","/main");
    }
     response.sendRedirect("/login");
  }
}