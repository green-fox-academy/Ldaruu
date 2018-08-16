package com.greenfoxacademy;

public class String1 {
  public static void main(String[] args) {
    System.out.println(changeX("xpcxxlkxyxux"));

  }

  public static String changeX(String word) {
    if (word.length() == 0) {
      return "";
    } else if (word.charAt(0) == 'x') {
      return 'Y' + changeX(word.substring(1));
    } else {
      return word.charAt(0) + changeX(word.substring(1));
    }

  }
}
// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.