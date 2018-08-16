package com.greenfoxacademy;

public class String3 {
  public static void main(String[] args) {
    System.out.println(addStars("hello"));
  }

  public static String addStars(String word) {
    if (word.length() == 0) {
      return "";
    } else
      return  word.charAt(0)+"*"+ addStars(word.substring(1));
  }
}
// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".