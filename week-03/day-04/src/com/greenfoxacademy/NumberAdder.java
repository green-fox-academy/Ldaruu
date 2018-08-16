package com.greenfoxacademy;

import java.util.Scanner;

public class NumberAdder {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please give me a number!");
    int numb = input.nextInt();
    System.out.println(addNum(numb));
  }

  public static int addNum(int n) {
    if (n == 0) {
      return n;
    } else {
      return addNum(n - 1) + n;
    }
  }
}
