package com.greenfoxacademy;

import java.util.Scanner;

public class  Bunny2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please tell me how many Bunnies do you have?");
    int bunny = input.nextInt();
    System.out.println(countEars(bunny));

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
