import java.util.Scanner;

public class Factorio {
  //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("What number factorial are you looking for?");
  int facto = input.nextInt();

  System.out.println(Factorial(facto));
}
  public static int Factorial(int untilLast) {
  int factNum = 1;
  for (int i = untilLast; i > 0; i--) {
    factNum *= i;
  }
  return factNum;
  }
}
