import java.util.Scanner;

public class AverageOfNumb {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
//    int[] numb = new int [5];
//    int sum = 0;
//    for (int i = 0; i < 5; i++)
//    {
      System.out.println("Please give me 5 numbers: ");
//     numb[i] = input.nextInt();
//     sum =+i;
//     int av = sum / (5);
    int integer1 = input.nextInt();
    int integer2 = input.nextInt();
    int integer3 = input.nextInt();
    int integer4 = input.nextInt();
    int integer5 = input.nextInt();

    int sum = (integer1 + integer2 + integer3 + integer4 + integer5);
    int avr = (integer1 + integer2 + integer3 + integer4 + integer5) / 5 ;
    System.out.println("Sum: " + sum + " Average: " + avr);
  }
}

