package com.greenfoxacademy;

import java.util.Scanner;

public class Counter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please give me a number!");
    int numb = input.nextInt();
    System.out.println(count(numb));
  }

  public static int count(int numb) {
    if (numb == 0) {
      return 0;
    } else {
      System.out.println(numb);
      return count(numb - 1);
    }
  }
}
