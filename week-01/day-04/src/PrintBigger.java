import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please give me a number: ");
    int a = input.nextInt();
    System.out.println("Please give me one more number: ");
    int b = input.nextInt();
    if(a > b) {
      System.out.println(a);
    }
    else {
      System.out.println(b);
    }
  }
}
