package com.greenfoxacademy.rest.model;

import org.springframework.stereotype.Component;

@Component
public class Until {

  private Long until;

  public Until() {
  }

  public Long getUntil() {
    return until;
  }

  public void setUntil(Long until) {
    this.until = until;
  }
}
