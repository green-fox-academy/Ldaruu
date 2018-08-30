import java.util.Arrays;

public class AppendA {
  public static void main(String[] args) {
    String animals[] = {"zebr", "pand", "koal"};
    String a = "a";
    for (int i = 0; i < animals.length; i++) {
      animals[i] += a;
    }
    System.out.println(Arrays.toString(animals));
  }
}
