import java.util.Scanner;

public class Cuboid {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please give me the Width, Length and the Height of the Cuboid:");
    double width = input.nextDouble();
    double length = input.nextDouble();
    double height = input.nextDouble();
    double Surfacearea = (2 * width * length) + (2 * length * height) + (2 * height * width);
    double volume = length * height * width;
    System.out.println("Surfacearea: " +Surfacearea);
    System.out.println("Volume: " +volume);
  }
}
// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000