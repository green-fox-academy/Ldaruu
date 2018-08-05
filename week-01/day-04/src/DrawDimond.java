import java.sql.SQLOutput;
import java.util.Scanner;

public class DrawDimond {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    int diamondLines = input.nextInt();
    int topLines;
    int bottomLines;
    int numbofstarElements = 1;
    String stars = "*";
    String spaces = " ";
    String currentLine;
    boolean bottomOddnum;


    if (diamondLines % 2 == 0) {
      topLines = diamondLines / 2;
      bottomOddnum = true;
    } else {
      topLines = (diamondLines / 2) + 1;
      bottomOddnum = false;
    }
    bottomLines = diamondLines - topLines;


//     The top of the Diamond
    for (int i = 0; i < topLines; i++) {

      currentLine = "";

      for (int j = 1; j < (topLines - i); j++) {

        currentLine += spaces;
      }
      for (int k = 0; k < numbofstarElements; k++) {
        currentLine += stars;
      }
      numbofstarElements += 2;
      System.out.println(currentLine);
    }

//      Bottom of the Diamond

    if (bottomOddnum) {
      for (int i = bottomLines; i > 0; i--) {
        numbofstarElements -= 2;
        currentLine = "";

        for (int j = bottomLines - i; j > 0; j--) {
          currentLine += spaces;
        }
        for (int k = numbofstarElements; k > 0; k--) {
          currentLine += stars;
        }
        System.out.println(currentLine);
      }
    }
      else {
        numbofstarElements -= 2;

        for (int i = bottomLines; i > 0; i--) {
          numbofstarElements -= 2;
          currentLine =" ";

          for (int j = bottomLines - i; j > 0; j--) {
            currentLine += spaces;
          }

          for (int k = numbofstarElements; k > 0; k--) {
            currentLine += stars;
          }
          System.out.println(currentLine);
        }

      }
    }
  }


// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was