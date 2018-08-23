import java.util.HashMap;

public class CountLetters {
  public static void main(String[] args) {
    System.out.println(countLetters("apple"));
  }

  public static HashMap<String, Integer> countLetters(String word) {
    HashMap<String, Integer> dictionary = new HashMap<>();
    for (char i : word.toCharArray()) {
      String letter = i + "";
      if (!dictionary.containsKey(letter)) {
        dictionary.put(letter, 1);
      } else {
        dictionary.put(letter, dictionary.get(letter) + 1);
      }
    }
    return dictionary;

  }
}
