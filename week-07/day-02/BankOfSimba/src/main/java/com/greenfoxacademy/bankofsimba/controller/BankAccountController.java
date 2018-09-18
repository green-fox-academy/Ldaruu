package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {


  BankAccount simba = new BankAccount("Simba", 2000, "lion");



  @RequestMapping("/show")
  public String banckAccount(Model model) {

    model.addAttribute("content", simba);
    return "show";
  }
}