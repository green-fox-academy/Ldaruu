import java.util.Scanner;

public class PartyIndicator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How many girls are coming to the party?");
    int girls = input.nextInt();
    System.out.println("How many boys are coming to the party?");
    int boys = input.nextInt();

    if ( girls == boys && boys + girls >= 20){
      System.out.println("The party is excellent!");
    }
    else if ((boys + girls >= 20) && (boys != girls) && (girls != 0)){
      System.out.println("Quite cool party!");
    }
    else if (boys + girls <20 && boys > 0 && girls != 0) {
      System.out.println("Average party...");
    }
    else if (girls == 0){
      System.out.println("Sausage party");
    }
  }
}
