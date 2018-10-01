package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.model.Result;
import com.greenfoxacademy.rest.model.Until;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ActionServices {

  private Until until;
  private Result result;

  @Autowired
  public ActionServices(Until until, Result result) {
    this.until = until;
    this.result = result;
  }

  public void doAction(String action, Until until) {
    if (action.equals("sum")) {
      sum(until);
    } else if (action.equals("factor")){
      factorial(until);
    }
  }

  public void sum(Until until) {
    long sum = 0;
    for (int i = 0; i <= until.getUntil(); i++) {
      sum += i;
    }
    result.setResult(sum);
  }

  public void factorial(Until until) {
    long fact = 1;
    for (int i = 1; i <= until.getUntil(); i++) {
      fact *= i;
    }
    result.setResult(fact);
  }

  public Until getUntil() {
    return until;
  }

  public void setUntil(Until until) {
    this.until = until;
  }

  public Result getResult() {
    return result;
  }

  public void setResult(Result result) {
    this.result = result;
  }
}
