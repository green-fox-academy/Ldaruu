import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner input1 = new Scanner(System.in);
    System.out.println("Please give a word: ");
    String word1 = input1.next();
    String reverse = "";

    for (int i = word1.length() -1 ; i >= 0; i-- ) {
      reverse = reverse + word1.charAt(i);

    }
    System.out.println(word1+reverse);
  }
}
