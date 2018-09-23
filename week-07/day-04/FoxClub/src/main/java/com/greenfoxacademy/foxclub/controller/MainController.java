package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.services.FoxServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
  private FoxServices foxServices;

  @Autowired
  public MainController(FoxServices foxServices) {
    this.foxServices = foxServices;
  }

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @GetMapping(value = "/")
  public String showMainPage(@RequestParam(required = false, value = "name") String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    }
    if (foxServices.isFoxinTheList(name)) {
      model.addAttribute("fox", foxServices.getFoxFromListByName(name));
      return "/index";
    } else {
      return "redirect:/login";
    }
  }

  @PostMapping(value = "/login")
  public String postFoxName(@RequestParam(value = "name") String name) {
    foxServices.createFoxandAddToList(name);
    return "redirect:/?name=" + name;
  }

  @GetMapping("/nutritionstore")
  public String nutrationPage(@RequestParam(required = false, value = "name") String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    }
    if (foxServices.isFoxinTheList(name)) {
      model.addAttribute("fox", foxServices.getFoxFromListByName(name));
      return "/nutritionstore";
    }
    return "redirect:/login";
  }

  @PostMapping(value = "/nutrition")
  public String postDinkandFood(@RequestParam(value = "name") String name, @RequestParam(value = "food") String food, @RequestParam(value = "drink") String drink) {
    foxServices.getFoxFromListByName(name).setFood(food);
    foxServices.getFoxFromListByName(name).setDrink(drink);
    return "redirect:/?name=" + name;

  }
}
