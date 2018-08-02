import java.util.Scanner;

public class OddEven
{
  public static void main(String[] args)
  {

    System.out.println("Please enter a number to check even or odd:");
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();

    if(a % 2 == 0)
    {
      System.out.println("Entered number is an EVEN number");
    }
    else
    {
      System.out.println("Entered number is an ODD number");
    }
  }
}
