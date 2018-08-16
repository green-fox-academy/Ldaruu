package com.greenfoxacademy;

public class String2 {
  public static void main(String[] args) {
    System.out.println(changeX("joijoixjoijxoixjixj"));

  }
  public static String changeX(String word) {
    if (word.length() == 0) {
      return "";
    } else if (word.charAt(0) == 'x') {
      return ""+ changeX(word.substring(1));
    } else {
      return word.charAt(0) + changeX(word.substring(1));
    }

  }
}