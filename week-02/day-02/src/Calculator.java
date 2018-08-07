import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
  public static void main(String... args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Please give me the first number!");
    double numb = input.nextDouble();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Please give me the operator! (+, -, *, /, %) ");
    String operator = input2.next();

    Scanner input3 = new Scanner(System.in);
    System.out.println("Please give me the second numb!");
    double numb2 = input3.nextDouble();
    System.out.println(Calculator(operator, numb, numb2));


    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations,
    // create a method named "calculate()":
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit
  }
  public static double Calculator(String operator, double numb, double numb2) {
    double result = 0;
    if (operator.equals("+")) {
      result = numb + numb2;
    }
    if (operator.equals("-")) {
      result = numb - numb2;
    }
    if (operator.equals("*")) {
      result = numb -numb2;
    }
    if (operator.equals("/")) {
      result = numb / numb2;
    }
    if (operator.equals("%")) {
      result = numb % numb2;
    }
    return result;
  }
}
