import java.util.ArrayList;
import java.util.Arrays;

public class Exercise1 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    numbers.stream()
        .filter(num -> num % 2 == 0)
        .forEach(System.out::println);
  }
}
