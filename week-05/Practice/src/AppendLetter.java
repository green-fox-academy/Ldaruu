import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendLetter {
  public static void main(String... args) {
    List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
    // Create a method called "appendA()" that adds "a" to every string in the "far" list.
    // The parameter should be a list.

    System.out.println(appendA(far));
  }

  public static ArrayList appendA(List<String> list) {
    List<String> mylist = new ArrayList<>();
    String a = "a";
    for (int i = 0; i < list.size(); i++) {
      mylist.add(list.get(i) + a);
    }
    return (ArrayList)   mylist;
  }
}
