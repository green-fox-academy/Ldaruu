import java.util.Scanner;

public class ParameticAverage {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Can you please give me a number!");
    int number = input.nextInt();
    System.out.println("Please enter "+number +"numbers!");
    int sum = 0;
    double mynumbs[]= new double[number];
    for (int i=0; i<number;  i++){
      int numb= input.nextInt();
      mynumbs[i] += numb;
    }
    for (int j=0; j<mynumbs.length; j++){
      sum +=mynumbs[j];
    }
    int av = sum/number;
    System.out.println("Sum: "+ sum+ ", Average: "+av);
  }
}
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4