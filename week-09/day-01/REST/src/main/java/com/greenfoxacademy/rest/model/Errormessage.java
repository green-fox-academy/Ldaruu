package com.greenfoxacademy.rest.model;

import org.springframework.stereotype.Component;

@Component
public class Errormessage {

  private String errorMassage;

  public Errormessage() {
  }

  public String getErrorMassage() {
    return errorMassage;
  }

  public void setErrorMassage(String errorMassage) {
    this.errorMassage = errorMassage;
  }
}
