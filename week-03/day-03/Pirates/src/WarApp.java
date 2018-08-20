import java.util.Scanner;

public class WarApp {
  public static void main(String[] args) {
    int shipsPerArmada = ArmadaNumber();
    Armada firstArmada = new Armada(shipsPerArmada);
    Armada secondArmada = new Armada(shipsPerArmada);

    firstArmada.war(secondArmada);
  }

  private static int ArmadaNumber() {
    Scanner userInputScanner = new Scanner(System.in);
    System.out.println("How many ships should be in an Armada?");
    return userInputScanner.nextInt();
  }
}