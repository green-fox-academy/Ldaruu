package com.greenfoxacedemy.bank.controllers;

import com.greenfoxacedemy.bank.models.BankAccount;
import com.greenfoxacedemy.bank.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AccountController {

  private AccountService accountService;

@Autowired
  public AccountController(AccountService accountService) {
    this.accountService = accountService;
  }

  @GetMapping("")
  public String loginPage() {
    return "redirect:/register";
  }

  @GetMapping("index/{id}")
  public String getMain(Model model, @PathVariable(value = "id") long id) {
    model.addAttribute("bankaccount", accountService.getUernameById(id));
    return "index";
  }

  @GetMapping("/register")
  public String registerPage(@ModelAttribute String warning, Model model) {
    model.addAttribute("warning", warning);
    model.addAttribute("bankaccount", new BankAccount());
    return "register";
  }

  @PostMapping("/register")
  public String addAccount(@RequestParam(value = "username") String username,
                           @RequestParam(value = "password") String password, Model model) {
    if (accountService.getAccByName(username) == null) {
      BankAccount bankAccount = accountService.createBankAccount(username, password);
      long userId = bankAccount.getId();
      return "redirect:/login";
    } else {
      model.addAttribute("warning", "Name exists Already, choose a new One!");
      return "redirect:/register";
    }
  }

  @GetMapping("/login")
  String loginPage(Model model) {
    model.addAttribute("bankaccount", new BankAccount());
    return "login";
  }

  @PostMapping("/login")
  public String sendLoginName(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
    if (username != null && password != null) {
      BankAccount bankAccount = accountService.getAccByName(username);
      long userId = bankAccount.getId();
      return "redirect:/index/" + userId;
    } else {
      return "redirect:/login";
    }
  }

  @GetMapping("/index/{id}/update")
  public String updatePage(@PathVariable(value = "id") Long id, Model model) {
    BankAccount bankAccount = accountService.getUernameById(id);
    model.addAttribute("bankaccount", bankAccount);
    return "update";
  }

  @PostMapping("/index/{id}/update")
  public String updateAccount(@ModelAttribute(value = "bankaccount") BankAccount bankAccount) {
    accountService.addNewAccount(bankAccount);
    return "redirect:/index/{id}";
  }

  @GetMapping("/users")
  public String allusers(Model model) {
    model.addAttribute("bankaccount", accountService.findAll());
    return "users";
  }

}
