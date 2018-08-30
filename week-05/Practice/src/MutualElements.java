import java.util.*;

public class MutualElements {
  public static void main(String[] args) {
//    / Create a method that takes two integer lists as a parameter
// and returns an integer list with the mutual elements from the lists.
// Write at least 3 different test cases.

// For example:
    List<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 3, 3, 4));
    List<Integer> b = new ArrayList<Integer>(Arrays.asList(3, 4, 4, 5, 6));
//
    System.out.println(filterMutualElements(a, b));
// Should print:
// [3,4]
  }

  public static List<Integer> filterMutualElements(List<Integer> a, List<Integer> b) {
    List<Integer> mutualNumbs = new ArrayList<>();
    for (int i = 0; i < a.size(); i++) {
      for (int j = 0; j < b.size(); j++) {
        if (a.get(i) == b.get(j)) {
          if (!mutualNumbs.contains(a.get(i))) {
            mutualNumbs.add(a.get(i));
          }
        }
      }
    }
    return mutualNumbs;

  }
}
