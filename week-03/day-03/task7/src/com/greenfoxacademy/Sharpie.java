package com.greenfoxacademy;

public class Sharpie {

  String color;
  float width;
  float inkAmount;

  public Sharpie(String color, float width) {
    inkAmount = 100f;
    this.color = color;
    this.width = width;
  }

  public void use() {
    inkAmount--;
  }

  @Override
  public String toString() {
    return "Sharpie[" +
        "ink amount = " + inkAmount +
        ", width = " + width + ", color = " + color +
        ']';
  }
}

