import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UniqueChart {
  public static void main(String[] args) {
    // Create a function called `uniqueCharacters` that takes a string as parameter
    // and returns a list with the unique letters of the given string
    // Create basic unit tests for it with at least 3 different test cases
    System.out.println(uniqueCharacters("anagram"));
    System.out.println(uniqueCharacters("hellobelloolona"));
    System.out.println(uniqueCharacters("magyarorszag"));
    // Should print out:
    // ["n", "g", "r", "m"]

  }

  public static List<String> uniqueCharacters(String word) {
    HashMap<String, Integer> unique = new HashMap<>();
    List<String> uniqueLetters = new ArrayList<>();
    for (char i : word.toCharArray()) {
      String letter = i + "";
      if (!unique.containsKey(letter)) {
        unique.put(letter, 1);
      } else {
        unique.put(letter, unique.get(letter) + 1);
      }
    }
    for (String letters : unique.keySet()) {
      if (unique.get(letters) == 1) {
        uniqueLetters.add(letters);
      }

    }
    return uniqueLetters;


  }
}
