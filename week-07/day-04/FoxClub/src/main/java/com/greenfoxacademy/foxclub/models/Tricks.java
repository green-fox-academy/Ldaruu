package com.greenfoxacademy.foxclub.models;

import org.springframework.stereotype.Component;
@Component
public class Tricks {

  private String trickName;

  public Tricks() {

  }

  public Tricks(String trickName) {
    this.trickName = trickName;
  }

  public String getTrickName() {
    return trickName;
  }

  public void setTrickName(String trickName) {
    this.trickName = trickName;
  }
}
