package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.model.Errormessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ErrorServices {

  private Errormessage errormassage;

  @Autowired
  public ErrorServices(Errormessage errormassage) {
    this.errormassage = errormassage;
  }
  public Errormessage setMessage(String message){
    errormassage.setErrorMassage(message);
    return errormassage;
  }


  public Errormessage getErrormassage() {
    return errormassage;
  }

  public void setErrormassage(Errormessage errormassage) {
    this.errormassage = errormassage;
  }
}
