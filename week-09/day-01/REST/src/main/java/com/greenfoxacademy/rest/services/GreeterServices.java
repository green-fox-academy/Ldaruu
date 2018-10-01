package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.model.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreeterServices {

  private Greeter greeter;

  @Autowired
  public GreeterServices(Greeter greeter) {
    this.greeter = greeter;
  }

  public void greetingM (String name, String title) {
    greeter.setMessage("Oh, hi there " + name + ", my dear" + title + "!");
  }

  public Greeter getGreeter() {
    return greeter;
  }

  public void setGreeter(Greeter greeter) {
    this.greeter = greeter;
  }
}
