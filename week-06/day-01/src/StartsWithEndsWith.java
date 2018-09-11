import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithEndsWith {
  public static void main(String[] args) {
//    Write a Stream Expression to find the strings which starts with A and ends with I in the following array:

    ArrayList<String> cities =
        new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    List<String> starsEnds = cities.stream()
        .filter(word -> word.startsWith("A") && word.endsWith("I"))
        .collect(Collectors.toList());
    System.out.println(starsEnds);
  }
}
