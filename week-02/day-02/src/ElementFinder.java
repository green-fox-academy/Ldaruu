import java.util.*;
import java.util.stream.IntStream;

public class ElementFinder {
  public static void main(String... args) {
    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(containsSeven(arrayList));
    System.out.println(containsSeven2(arrayList));
    // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
    // The output should be: "Noooooo"
    // Do this again with a different solution using different list methods!
  }

  public static String containsSeven(ArrayList arrayList) {
    if (arrayList.contains(7)) {

      return "Hooray";
    } else {
      return "Nooooo";
    }
  }


  public static String containsSeven2(ArrayList arrayList) {
    String truth = "NooooooNein!";
    for (int i = 0; i <= arrayList.size() - 1; i++) {
      if (arrayList.get(i).equals(3)) {
        truth = "HellYes";
      }

    }
    return truth;
  }
}


