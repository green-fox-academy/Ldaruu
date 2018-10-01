package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.model.Appenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppendaServices {

  Appenda appenda;

  @Autowired
  public AppendaServices(Appenda appenda) {
    this.appenda = appenda;
  }

  public Appenda appenda(String word) {
    appenda.setAppenda(word + "a");
    return appenda;
  }

  public Appenda getAppenda() {
    return appenda;
  }

  public void setAppenda(Appenda appenda) {
    this.appenda = appenda;
  }
}
