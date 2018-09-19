package com.greenfoxacademy.helloworldbean.services;

import org.springframework.stereotype.Service;

@Service
public class PrintingInBlue implements MyColor {
  @Override
  public void printColor() {
    System.out.println("It's printing in Blue!");
  }
}
