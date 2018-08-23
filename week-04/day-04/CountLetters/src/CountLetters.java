import java.util.HashMap;

public class CountLetters {
  public static void main(String[] args) {
    System.out.println(countLetters("apple"));
    System.out.println(wordMaker(countLetters("iiidddslklk"), 3));
  }

  public static String wordMaker(HashMap<String, Integer> map, Integer num) {  //iterating through the HashMap and creating words from
                                                                               // the letters which are num times in the Map
    String myWord = "";
    for (String key : map.keySet()) {
      if (map.get(key).equals(num)) {
        myWord += key;
      }
    }
    return myWord;
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
