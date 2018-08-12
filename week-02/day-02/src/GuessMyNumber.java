import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numtries = 5;
    int userguess = 0;
    int minnumb = 1;
    int maxnum = 100;
    int thenum = minnumb + (int) (Math.random() * ((maxnum - minnumb) + 1));

    while (userguess != thenum) {
      System.out.println("I've the number between " + minnumb + " and " + maxnum + " . You have 5 lives.");
      userguess = input.nextInt();
      numtries--;
      if (userguess < minnumb || userguess > maxnum) {
        System.out.println("Make sure your guess is between " + minnumb + " and " + maxnum);
      } else if (userguess < thenum) {
        System.out.println("Too low, you have " + numtries + " lives left!");
      } else if (userguess > thenum) {
        System.out.println("Too high, you have " + numtries + " lives left!");
      } else if (userguess == thenum) {
        System.out.println("Congratulations. You won!");
      }

    }
  }
}
