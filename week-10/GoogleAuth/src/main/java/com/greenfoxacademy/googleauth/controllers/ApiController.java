package com.greenfoxacademy.googleauth.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class ApiController {

//    @GetMapping("/")
//  public String index() {
//    return "oauth2_extractors";
//  }
  @GetMapping("/main")
  public String indexpage(Model model, Principal principal){
    model.addAttribute("user",principal);
    return "main";
  }
}