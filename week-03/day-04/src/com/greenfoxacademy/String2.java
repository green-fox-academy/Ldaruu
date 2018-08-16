package com.greenfoxacademy;

public class String2 {
  public static void main(String[] args) {
    System.out.println(removeX("joijoixjoijxoixjixj"));

  }
  public static String removeX(String word) {
    if (word.length() == 0) {
      return "";
    } else if (word.charAt(0) == 'x') {
      return ""+ removeX(word.substring(1));
    } else {
      return word.charAt(0) + removeX(word.substring(1));
    }

  }
}