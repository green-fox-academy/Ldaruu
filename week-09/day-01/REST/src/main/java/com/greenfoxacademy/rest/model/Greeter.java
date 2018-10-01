package com.greenfoxacademy.rest.model;

import org.springframework.stereotype.Component;

@Component
public class Greeter {

  private String message;

  public Greeter() {
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}

