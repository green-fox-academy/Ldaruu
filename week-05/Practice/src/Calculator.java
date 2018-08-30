import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("If you want to calculate please follow the instruction\nPlease enter an expression like:\nExamples: + 3 3 ");
    String operator = input.next();
    int firstNum = input.nextInt();
    int secondNum = input.nextInt();
    calculate(operator,firstNum,secondNum);

  }

  public static void calculate(String operator, int num1, int num2) {
    int result = 0;
    switch (operator) {
      case "+":
        System.out.println(result = num1 + num2);
        break;
      case "-":
        System.out.println(result = num1 - num2);
        break;
      case "*":
        System.out.println(result = num1 * num2);
        break;
      case "/":
        System.out.println(result = num1 / num2);
        break;
      case "%":
        System.out.println(result = num1 % num2);
        break;
    }
  }
}
