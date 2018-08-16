package com.greenfoxacademy;

public class SumDigit {
  public static void main(String[] args) {
    System.out.println(addDig(666));

  }

  public static int addDig(int n) {
    if (n / 10 == 0) {
      return n;
    } else {
      return addDig(n / 10) + (n % 10);
    }
  }
}
// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).