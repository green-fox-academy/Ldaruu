import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfChar {
  public static void main(String[] args) {
//    Write a Stream Expression to
    String mystring = "adwinjaskjcnaldnaoqijf";

    Map<Character, Long> freq = mystring.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

    System.out.println(freq);

  }
}
