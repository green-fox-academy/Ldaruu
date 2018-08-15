package com.greenfoxacademy;

public class Sharpie {

  String color;
  float width;
  float inkAmount = 100;

  public void use(){
    inkAmount --;
  }
  @Override
  public String toString() {
    return "Sharpie[" +
        "ink amount = " + inkAmount +
        ", width = " + width + ", color = " +color+
        ']';
  }
}

