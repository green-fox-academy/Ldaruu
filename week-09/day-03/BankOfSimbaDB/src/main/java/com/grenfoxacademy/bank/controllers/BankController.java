package com.grenfoxacademy.bank.controllers;

import com.grenfoxacademy.bank.models.BankAccount;
import com.grenfoxacademy.bank.services.Bankservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BankController {

  private Bankservices bankservices;

  @Autowired
  public BankController(Bankservices bankservices) {
    this.bankservices = bankservices;
  }

  @GetMapping("/login")
  public String loginPage() {
    return "login";
  }

  @GetMapping(value = "/")
  public String showMainPage(@RequestParam(required = false, value = "name") String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    }
    if (bankservices.isUserExistAlready(name)) {
      model.addAttribute("account", bankservices.getAccByName(name));
      return "/index";
    } else {
      return "redirect:/login";
    }
  }

  @PostMapping("/login")
  public String sendLoginName(@ModelAttribute(value = "username") String username) {
    if (bankservices.isUserExistAlready(username)) {
      return "redirect:/?name=" + username;
    } else {
      bankservices.createBankAccount(username);
    }
    return "redirect:/login";
  }

}
