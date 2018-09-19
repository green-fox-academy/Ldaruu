package com.greenfoxacademy.helloworldbean.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrintingInBlue implements MyColor {
  Printer bueprint;
@Autowired
  public PrintingInBlue(Printer bueprint) {
    this.bueprint = bueprint;
  }

  @Override
  public void printColor() {
  bueprint.log("It's printing in Blure!");
  }
}
