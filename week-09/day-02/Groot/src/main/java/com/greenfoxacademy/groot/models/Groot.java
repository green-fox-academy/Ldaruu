package com.greenfoxacademy.groot.models;

import org.springframework.stereotype.Component;

@Component
public class Groot {
  private String received;
  private String translated;

  public Groot(String received) {
    this.received = received;
    this.translated = "I am Groot!";
  }

  public Groot() {
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return "I am Groot!";
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
