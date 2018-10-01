package com.greenfoxacademy.rest.model;

import org.springframework.stereotype.Component;

@Component
public class Doubling {

 private Long received;
 private Long result;

  public Doubling() {
  }

  public Long getReceived() {
    return received;
  }

  public void setReceived(Long received) {
    this.received = received;
  }

  public Long getResult() {
    return result;
  }

  public void setResult(Long result) {
    this.result = result;
  }
}
