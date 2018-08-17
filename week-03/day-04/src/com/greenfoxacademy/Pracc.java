package com.greenfoxacademy;

import java.util.Arrays;

public class Pracc {
  public static void main(String[] args) {
    int[] myArray = {6, 33, 55, 2, 77};
    int[] reverse = new int[myArray.length];
    for (int i = 0; i < myArray.length; i++) {
      reverse[myArray.length - i - 1] = myArray[i];
    }
    System.out.println(Arrays.toString(reverse));
  }
}
