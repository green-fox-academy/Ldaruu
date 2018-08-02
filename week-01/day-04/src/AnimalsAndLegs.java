import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How many chickens are on the farm?");
    int chicken = input.nextInt();
    System.out.println("How mny pigs do you have?");
    int pig = input.nextInt();
    int legs = (chicken * 2 + pig * 4);
    System.out.println("You have: " + legs + " animal legs on the farm.");
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have
  }
}
