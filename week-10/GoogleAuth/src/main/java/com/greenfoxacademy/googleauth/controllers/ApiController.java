package com.greenfoxacademy.googleauth.controllers;

import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.LinkedHashMap;

@Controller
public class ApiController {

//  @GetMapping("/main")
//  public String indexpage(Model model, Principal principal) {
//    model.addAttribute("user", principal);
//    return "main";
//  }

  @GetMapping("/main")
  public String user(OAuth2Authentication authentication) {
    LinkedHashMap<String, Object> properties = (LinkedHashMap<String, Object>) authentication.getUserAuthentication().getDetails();
    String email = (String) properties.get("email");
    if (!email.endsWith("gmail.com")) {
      return "redirect:/index";
    }
    return "main";
  }
}