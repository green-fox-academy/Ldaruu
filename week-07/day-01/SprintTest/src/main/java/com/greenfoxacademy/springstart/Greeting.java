package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

  private long id;
  private String content;
  private static AtomicLong ATOMIC_LONG = new AtomicLong(1);


  public Greeting() {
  }

  public Greeting(String content) {
    this.id = ATOMIC_LONG.getAndIncrement();
    this.content = content;
  }



  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}