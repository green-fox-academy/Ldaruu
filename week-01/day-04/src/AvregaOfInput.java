import java.util.Scanner;
import java.util.stream.IntStream;

public class AvregaOfInput {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
//    int numbs[] = new int[5];
    for (int i = 0; i < 5; i++) {
      System.out.print("Give me 5 numbers: ");
      int a = input.nextInt();
      int sum = (a + a + a + a + a);
      System.out.println("Sum: " +sum);


    }
  }
}