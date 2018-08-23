import java.util.HashMap;

public class CountLetters {

  public HashMap<String, Integer> countLetters(String word) {
    HashMap<String, Integer> dictionary = new HashMap<>();
    for (int i = 0; i < dictionary.size(); i++) {
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
