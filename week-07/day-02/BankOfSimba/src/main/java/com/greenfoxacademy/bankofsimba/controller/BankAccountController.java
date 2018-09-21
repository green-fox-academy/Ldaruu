package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.Bank;
import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    model.addAttribute("newacc", new BankAccount());
    return "show";
  }

  @PostMapping("show")
  public String addAccount(@ModelAttribute(value = "name")BankAccount account) {
    lionKing.addAccount(account);
    return "redirect:/";
  }

//  @PostMapping("show")
//  public String addAccount(@RequestParam(value = "name") String name, @RequestParam(value = "balance") double balance,
//                           @RequestParam(value = "currency") String currency,
//                           @RequestParam(value = "type") String animalType, @RequestParam(value = "isKing") boolean isKing,
//                           @RequestParam(value = "isGood") boolean isBad) {
//    lionKing.creatAccount(name, balance, currency, animalType, isKing, isBad);
//    return "redirect:/";
//  }

  @PostMapping("remove")
  public String removeAccount(@RequestParam(value = "RemoveAccount") int index) {
    lionKing.removeAccount(index);
    return "redirect:/";
  }

  @PostMapping("addbalance")
  public String addMoney(@RequestParam(value = "balance") double balance, @RequestParam(value = "index") int index) {
    lionKing.addBalance(balance, index);
    return "redirect:/";
  }

  @PostMapping("withdraw")
  public String withDraw(@RequestParam(value = "balance") double balance, @RequestParam(value = "index") int index) {
    lionKing.withDrawMoney(balance, index);
    return "redirect:/";
  }
}