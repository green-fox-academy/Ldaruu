import java.util.Arrays;

public class Anagramm {
  public static void main(String[] args) {
    String word1 = "Funeral";
    String word2 = "RealFun";
    System.out.println(isAnagramm(word1,word2));

  }

  public static boolean isAnagramm(String a, String b) {
    char aArray[] = a.toLowerCase().toCharArray();
    char bArray[] = b.toLowerCase().toCharArray();
    Arrays.sort(aArray);
    Arrays.sort(bArray);
    return Arrays.equals(aArray,bArray);
  }
}
