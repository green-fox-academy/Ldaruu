package com.greenfoxacademy.groot.models;

import org.springframework.stereotype.Component;

@Component
public class GrootError {
  private String error;

  public GrootError() {
  }

  public GrootError(String error) {
    this.error = error;
  }

  public String getError() {
    return "I am Groot!";
  }

  public void setError(String error) {
    this.error = "I am Groot!";
  }
}
