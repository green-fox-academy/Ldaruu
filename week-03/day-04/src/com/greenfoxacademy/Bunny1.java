package com.greenfoxacademy;

public class Bunny1 {
  public static void main(String[] args) {
    System.out.println(countEars(2));

  }

  public static int countEars (int bunny) {
    int ears = 2;
    if (bunny == 0) {
      return bunny;
    }else {
      return  ears + countEars(bunny-1);
    }
  }
}
// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
