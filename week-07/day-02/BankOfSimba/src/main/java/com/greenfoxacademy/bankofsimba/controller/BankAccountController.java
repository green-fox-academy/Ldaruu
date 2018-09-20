package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.Bank;
import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BankAccountController {

  Bank lionKing;

  @Autowired
  public BankAccountController(Bank lionKing) {
    this.lionKing = lionKing;
  }

  @RequestMapping("/showacc")
  public String ahowAccount(Model model) {
    BankAccount simba = new BankAccount("Simba", 2000, "lion", "Zebra", true, false);
    model.addAttribute("showaccount", simba);
    return "showacc";
  }

  @RequestMapping("/")
  public String banckAccount(Model model) {

    model.addAttribute("bank", lionKing.getBank());
    return "show";
  }

  @PostMapping("show")
  public String addAccount(@RequestParam(value = "name") String name, @RequestParam(value = "balance") double balance,
                           @RequestParam(value = "currency") String currency,
                           @RequestParam(value = "type") String animalType, @RequestParam(value = "isKing") boolean isKing,
                           @RequestParam(value = "isGood") boolean isBad) {
    lionKing.creatAccount(name, balance, currency, animalType, isKing, isBad);
    return "redirect:/";
  }

//  @PostMapping("show")
//  public String removeAccount() {
//
//    return "redirect:/";
//  }
}