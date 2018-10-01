package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.model.Errormessage;
import com.greenfoxacademy.rest.services.ErrorServices;
import com.greenfoxacademy.rest.services.GreeterServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

  private GreeterServices greeterServices;
  private ErrorServices errorServices;

  @Autowired
  public GreeterController(GreeterServices greeterServices, ErrorServices errorServices) {
    this.greeterServices = greeterServices;
    this.errorServices = errorServices;
  }

  @GetMapping("/greeter")
  public Object greeting(@RequestParam(value = "name", required = false) String name,
                         @RequestParam(value = "title", required = false) String title) {
    if (name == null && title == null) {
      return errorServices.setMessage("No Input provided!");
    } else if (name == null) {
      return errorServices.setMessage("No name Provided!");
    } else if (title == null) {
      return errorServices.setMessage("No title Provided!");
    } else {
      greeterServices.greetingM(name, title);
    }
    return greeterServices.getGreeter();
  }

}
