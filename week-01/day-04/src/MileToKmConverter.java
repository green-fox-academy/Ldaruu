import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
    Scanner input = new Scanner(System.in);
    System.out.println("How far do you live in kilometers?");
    int km = input.nextInt();
    double miles = (km * 0.621);
    System.out.println("That is: "+ miles +" miles away.");
  }
}
