import java.util.Random;
import java.util.Scanner;

public class GuessMyNum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int userGuess = 0;
    Random random = new Random();
    int numberToGuess = 1 + random.nextInt(50);
    int life = 5;

    while (userGuess != numberToGuess && life != 0) {
      System.out.println("I've the number between 1-50. You have 5 lives.");
      userGuess = input.nextInt();
      life--;
      if (userGuess > numberToGuess) {
        System.out.println("Too high. You have " + life + " more lives left");
      } else if (userGuess < numberToGuess) {
        System.out.println("Too low. You have " + life + " more lives left");
      } else if (userGuess == numberToGuess) {
        System.out.println("Congratulation! You have guessed the Number right!");
      }
      if (life == 0) {
        System.out.println("You Lost!!!");
      }
    }
  }
}