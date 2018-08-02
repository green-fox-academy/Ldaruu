import java.util.Scanner;

public class OneTwoALot {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please give me a number: ");
    int a = input.nextInt();

    if(a <= 0) {
      System.out.println("Not Enough!");
    }
    else if (a == 1){
      System.out.println("One");
    }
    else if (a == 2){
      System.out.println("Two");
    }
    else{
      System.out.println("A lot");
    }

  }
}
