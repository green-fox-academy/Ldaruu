import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class NumbersFrequency {
  public static void main(String[] args) {
//    Write a Stream Expression to find the frequency of numbers in the following array:

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

    Map<Integer, Long> freq = numbers.stream()
        .collect(Collectors.groupingBy(num -> num, Collectors.counting()));
    System.out.println(freq);
  }
}
