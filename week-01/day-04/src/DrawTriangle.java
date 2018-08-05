import java.util.Scanner;

public class DrawTriangle {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Please give me a number: ");

     int numb = input.nextInt();
     String currentTriangleLevel = "";
     String oneElementofTriangle ="*";
     int i;
     for (i = 0; i < numb; i++) {
       currentTriangleLevel += oneElementofTriangle;
       System.out.println(currentTriangleLevel);
     }
  }
}

// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was