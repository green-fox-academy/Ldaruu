import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a numbers: ");
    int sumUntil = input.nextInt();
    sumUntil++;
    System.out.println(sum(sumUntil));
  }

  public static int sum(int lastNum) {
    int sumNumbs = 0;
    for (int i = 0; i < lastNum; i++) {
      sumNumbs += i;
    }
    return sumNumbs;
  }

}

//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer