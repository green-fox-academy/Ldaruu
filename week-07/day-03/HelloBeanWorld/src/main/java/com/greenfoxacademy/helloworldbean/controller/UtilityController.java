package com.greenfoxacademy.helloworldbean.controller;

import com.greenfoxacademy.helloworldbean.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

  @RequestMapping("/useful/email")
  public String emailValidation(@RequestParam(value = "email") String email, Model model) {
    service.setEmail(email);
    model.addAttribute("checkemail", service.emailValidation());
    model.addAttribute("getemail", service.getEmail());
    return "email";
  }

  @RequestMapping("/useful/decodin")
  public String decode(@RequestParam(value = "text") String text, @RequestParam(value = "numb") int numb, Model model) {
    model.addAttribute("decodintext", service.caesar(text, -numb));
    model.addAttribute("text", text);
    model.addAttribute("numb",numb);
    return "decodin";
  }

  @RequestMapping("/useful/encodin")
  public String encodin(@RequestParam(value = "text") String text, @RequestParam(value = "numb") int numb, Model model) {
    model.addAttribute("encodetext", service.caesar(text, numb));
    model.addAttribute("text", text);
    model.addAttribute("numb",numb);
    return "encodin";
  }
}