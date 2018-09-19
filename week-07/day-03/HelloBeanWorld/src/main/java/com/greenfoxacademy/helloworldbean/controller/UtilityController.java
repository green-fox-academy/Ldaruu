package com.greenfoxacademy.helloworldbean.controller;

import com.greenfoxacademy.helloworldbean.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilityController {

  UtilityService service;

  @Autowired
  public UtilityController(UtilityService service) {
    this.service = service;
  }


  @RequestMapping("/useful")
  public String usefulCases() {
    return "useful";
  }

  @RequestMapping("useful/colored")
  public String coloredBack(Model model) {
    model.addAttribute("backgroundColor", service.randomColor());
    return "colored";
  }
}
