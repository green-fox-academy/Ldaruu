import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Battle {
  public static void main(String[] args) {
    int numberOfShips = shipNumber();
    List<Ship> shipList = createArmada(numberOfShips);
    printShipDetails(shipList);
    battleFirstTwo(shipList);
    printShipDetails(shipList);
  }

  private static void battleFirstTwo(List<Ship> shipList) {
    Ship ship1 = shipList.get(0);
    Ship ship2 = shipList.get(1);
    if (ship1.battle(ship2)) {
      System.out.println("The first ship won.");
    } else {
      System.out.println("The second ship won.");
    }
  }

  private static void printShipDetails(List<Ship> shipList) {
    for (int index = 0; index < shipList.size(); index++) {
      System.out.println(shipList.get(index));
    }
  }

  private static int shipNumber() {
    Scanner userInputScanner = new Scanner(System.in);
    System.out.println("How many ships should be created?");
    return userInputScanner.nextInt();

  }

  private static List<Ship> createArmada(int numberOfShips) {
    List<Ship> shipList = new ArrayList<>();
    for (int index = 0; index < numberOfShips; index++) {
      shipList.add(new Ship());
      shipList.get(index).fillShip();
    }
    return shipList;
  }
}

