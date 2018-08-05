import java.util.Scanner;

public class DrawPyramid {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberOfLineElements = 1;
    String pyramidElement = "*";
    String spaceElement = " ";
    String currentLine;

    System.out.println("Please, Enter a number: ");
    int pyramidLines = scanner.nextInt();

//    Changing the Lines

    for (int i = 0; i < pyramidLines; i++) {

      currentLine = "";

//      Puting the Spaces

      for (int j = 1; j < (pyramidLines - i); j++) {
        currentLine += spaceElement;
      }

//    Drawing the *

      for (int k = 0; k < numberOfLineElements; k++) {
        currentLine += pyramidElement; }

      numberOfLineElements += 2;

      System.out.println(currentLine);

    }

  }
}

// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

