package com.greenfoxacademy;

public class Main {

  public static void main(String[] args) {
    PostIt one = new PostIt();
    one.backroundcolor = "black";
    one.textColor = "red";
    one.text = "Idea1";

    PostIt two = new PostIt();
    two.backroundcolor="orange";
    two.textColor="black";
    two.text="Awesome";

    PostIt three = new PostIt();
    three.backroundcolor= "red";
    three.textColor="blue";
    three.text="Superb";

    System.out.println( one.backroundcolor);
    // write your code here
  }
}
