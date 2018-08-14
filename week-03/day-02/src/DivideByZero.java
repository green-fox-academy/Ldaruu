import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please give me a number: ");
    int a = input.nextInt();
    divide(a);
  }
    public static void divide(int a){
    int result =0;
     try {
        result = 10/a;
       System.out.println(result);
     } catch (ArithmeticException e) {
       System.out.println("Can not divide by zero!");
     }

  }
}
// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0