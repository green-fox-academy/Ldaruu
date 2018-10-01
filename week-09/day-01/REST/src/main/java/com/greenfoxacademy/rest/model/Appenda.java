package com.greenfoxacademy.rest.model;

import org.springframework.stereotype.Component;

@Component
public class Appenda {

  private String appenda;

  public Appenda() {
  }

  public String getAppenda() {
    return appenda;
  }

  public void setAppenda(String appenda) {
    this.appenda = appenda;
  }
}
