import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseCharacters {
  public static void main(String[] args) {
//    Write a Stream Expression to find the uppercase characters in a string!

    String mystring="Hello World how Are yoU ToDay?";

    List<Character> uppercase = mystring.chars()
        .filter(c-> Character.isUpperCase(c))
        .mapToObj(c->(char)c)
        .collect(Collectors.toList());
    System.out.println(uppercase);
  }
}
