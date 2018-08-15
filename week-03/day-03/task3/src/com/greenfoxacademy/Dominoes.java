package com.greenfoxacademy;
import java.util.Arrays;

public class Dominoes {
  private final int[] values;

  public Dominoes(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};

  }

  public int[] getValues() {
    return values;
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }
}