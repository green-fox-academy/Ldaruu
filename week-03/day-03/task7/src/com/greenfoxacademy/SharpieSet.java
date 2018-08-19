package com.greenfoxacademy;

import java.util.ArrayList;

public class SharpieSet {

  ArrayList<Sharpie> sharpies = new ArrayList<>();

  public SharpieSet() {

  }

  public void addSharpie(Sharpie pen) {
    sharpies.add(pen);
  }

  public int countUsable(int usable) {
    usable = 0;
    for (int i = 0; i < sharpies.size(); i++) {
      if (sharpies.get(i).inkAmount > 0) {
        usable++;
      }
    }
    return usable;
  }

  public void removeTrash() {
    for (int j = 0; j < sharpies.size(); j++) {
      if (sharpies.get(j).inkAmount == 0) {
        sharpies.remove(sharpies.get(j));
      }
    }
  }

  public void printSharies() {
    for (int i = 0; i < sharpies.size(); i++) {
      System.out.println("Color:\t"+ sharpies.get(i).color+";\t Ink level:\t" + sharpies.get(i).inkAmount+";\t Width:\t" + sharpies.get(i).width);
    }
  }
}
