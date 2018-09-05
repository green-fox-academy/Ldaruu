import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class SquaredValue {
  public static void main(String[] args) {

//    Write a Stream Expression to get the squared value of the positive numbers from the following array:

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

       numbers.stream()
        .filter(num -> num > 0)
        .mapToInt(num -> num * num)
           .sorted()
           .forEach(System.out::println);

  }
}
