import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
  public static void main(String[] args) {
    Scanner input1 = new Scanner(System.in);
    System.out.println("Please give me the first word: ");
    String word1 = input1.next();
    System.out.println("Please give me the secod word: ");
    Scanner input2 = new Scanner(System.in);
    String word2 = input2.next();
    String a = "It is an ANAGRAM!";
    String b = "It is NOT ANAGRAM!";

    System.out.println(isAnagram(word1, word2, a, b));


  }

  public static String isAnagram(String word1, String word2, String a, String b) {

    char[] word1Array = word1.toCharArray();
    char[] word2Array = word2.toCharArray();
    Arrays.sort(word1Array);
    Arrays.sort(word2Array);

    if (Arrays.equals(word1Array, word2Array)) {
      return a;
    } else {
      return b;
    }

  }
}
