package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.model.Doubling;
import jdk.internal.util.xml.impl.Input;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InputServices {

  private Doubling doubling;

  @Autowired
  public InputServices(Doubling doubling) {
    this.doubling = doubling;
  }
  public void setReceived(Long received){
    doubling.setReceived(received);
  }
  public Long getResult(){
    doubling.setResult(doubling.getReceived()*2);
    return doubling.getResult();
  }

  public Doubling getDoubling() {
    return doubling;
  }

  public void setDoubling(Doubling doubling) {
    this.doubling = doubling;
  }
}
