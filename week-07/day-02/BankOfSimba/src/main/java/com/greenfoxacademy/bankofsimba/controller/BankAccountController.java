package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.Bank;
import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BankAccountController {

  Bank lionKing = new Bank();

  @RequestMapping("/showacc")
  public String ahowAccount(Model model) {
    BankAccount simba = new BankAccount("Simba", 2000, "lion","Zebra",true,false);
    model.addAttribute("showaccount", simba);
    return "showacc";
  }

  @RequestMapping("/")
  public String banckAccount(Model model) {
    model.addAttribute("bank", lionKing.getBank());
    return "show";
  }
}