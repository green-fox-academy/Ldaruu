package com.greenfoxacademy;

public class Refactorio {
  public static void main(String[] args) {
    System.out.println(reFactorio(5));
  }

  public static int reFactorio(int n) {
    if (n == 0) {
      return 1;
    } else {
      return reFactorio(n - 1) * n;
    }
  }
}