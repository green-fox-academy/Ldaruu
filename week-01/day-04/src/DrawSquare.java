import java.util.Scanner;

public class DrawSquare {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please Enter a number: ");
    int squareLine = input.nextInt();

    for (int i = 0; i <= squareLine; i++){
      for (int b = 0; b <= squareLine; b++) {
        if (i == 0 || b == 0 || i == squareLine || b == squareLine) {
          System.out.print("%");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
