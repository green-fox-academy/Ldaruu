package com.greenfoxacademy.googleauth.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class ApiController {

//  @GetMapping("/user")
//  public Principal user(Principal principal) {
//    return principal;
//  }
  @GetMapping("/main")
  public String indexpage(){
    return "main";
  }
}