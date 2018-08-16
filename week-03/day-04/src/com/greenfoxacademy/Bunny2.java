package com.greenfoxacademy;

public class  Bunny2 {
  public static void main(String[] args) {
    System.out.println(countEars(3));

  }

  public static int countEars(int bunny) {
    int ears1 = 2;
    int ears2 = 3;
    if (bunny == 0) {
      return 0;
    }
    if (bunny % 2 != 0) {
      return ears2 + countEars(bunny - 1);
    }
    else {
      return ears1 + countEars(bunny - 1);
    }
  }
}
