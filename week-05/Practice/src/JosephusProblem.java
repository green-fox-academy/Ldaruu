import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How many people in the circe?");
    int numOfPpl= input.nextInt();

    System.out.println(winningSeat(numOfPpl));
  }
  public static ArrayList<Integer> winningSeat(int number){
    ArrayList<Integer> bestPlace =new ArrayList<>();
    for (int i = 1; i <=number ; i++) {
      bestPlace.add(i);
    }
    while (bestPlace.size()!=1) {
      for (int i = 1; i < bestPlace.size(); i++) {
        bestPlace.remove(i);
        if (i == bestPlace.size()-1) {
          bestPlace.remove(0);
          i=0;
        }
      }
    }
    return bestPlace;
  }
}
