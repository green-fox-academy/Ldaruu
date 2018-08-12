import java.util.Scanner;

public class JosephusProblem {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please give me how many people in the circle!");
    int numOfPpl = input.nextInt();
    int everysecond = 2;
    System.out.println("You have to stend in position: " + josephus(numOfPpl, everysecond)+ " if you want to survive!");
  }

  public static int josephus(int numOfPpl, int everysecond) {
    if (numOfPpl == 1) {
      return 1;
    } else {
      return (josephus(numOfPpl - 1, everysecond) + (everysecond - 1)) % numOfPpl + 1;
    }
  }
}
