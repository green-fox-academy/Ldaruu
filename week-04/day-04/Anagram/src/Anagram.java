import java.util.Arrays;

public class Anagram {


  public static boolean isAnagram(String word1, String word2) {

    char[] word1Array = word1.toCharArray();
    char[] word2Array = word2.toCharArray();
    Arrays.sort(word1Array);
    Arrays.sort(word2Array);

    if (Arrays.equals(word1Array, word2Array)) {
      return true;
    } else {
      return false;
    }
  }
}