package com.grenfoxacademy.bank.controllers;

import com.grenfoxacademy.bank.models.BankAccount;
import com.grenfoxacademy.bank.services.Bankservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BankController {

  private Bankservices bankservices;


  @Autowired
  public BankController(Bankservices bankservices) {
    this.bankservices = bankservices;
  }

  @GetMapping("/")
  public String loginPage() {
    return "redirect:/register";
  }

  @GetMapping("/{id}")
  public String getMain(Model model, @PathVariable(value = "id") long id) {
    model.addAttribute("bankaccount", bankservices.getUernameById(id));
    return "index";
  }

  @GetMapping("/register")
  public String registerPage(@ModelAttribute String warning, Model model) {
    model.addAttribute("warning",warning);
    model.addAttribute("bankaccount", new BankAccount());
    return "register";
  }

  @PostMapping("/register")
  public String addAccount(@RequestParam(value = "username") String username,
                           @RequestParam(value = "password") String password, Model model) {
    if (bankservices.getAccByName(username) == null) {
      BankAccount bankAccount = bankservices.createBankAccount(username, password);
      long userId = bankAccount.getId();
      return "redirect:/" + userId;
    } else {
      model.addAttribute("warning", "Name exists Already, choose a new One!");
      return "redirect:/register";
    }
  }

  @PostMapping("/login")
  public String sendLoginName(@ModelAttribute(value = "username") String username) {
    if (bankservices.getAccByName(username) != null) {

      return "redirect:/?name=" + username;
    } else {
//      bankservices.createBankAccount(username);
    }
    return "redirect:/login";
  }
}

