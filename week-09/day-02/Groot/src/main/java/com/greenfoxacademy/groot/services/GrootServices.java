package com.greenfoxacademy.groot.services;

import com.greenfoxacademy.groot.models.Groot;
import com.greenfoxacademy.groot.models.GrootError;
import org.springframework.stereotype.Service;

@Service
public class GrootServices implements GuardianServices{


  @Override
  public Groot getmessage(String message) {
    Groot groot= new Groot(message);
    return groot;
  }

  @Override
  public GrootError errormessage() {
    GrootError grootError=new GrootError();
    return grootError;
  }
}
