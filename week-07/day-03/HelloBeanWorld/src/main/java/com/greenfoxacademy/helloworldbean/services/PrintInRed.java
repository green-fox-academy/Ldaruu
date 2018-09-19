package com.greenfoxacademy.helloworldbean.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrintInRed implements MyColor {

  Printer redPrint;

  @Autowired
  public PrintInRed(Printer redPrint) {
    this.redPrint = redPrint;
  }

  @Override
  public void printColor() {
    redPrint.log("It's printing in Red!");
  }
}
