import java.util.ArrayList;
import java.util.List;

public class Armada {
  private List<Ship> shipList = new ArrayList<>();

  public Armada(int numOfShips) {
    for (int index = 0; index < numOfShips; index++) {
      shipList.add(new Ship());
      shipList.get(index).fillShip();
    }
  }

  public void war(Armada otherArmada) {
    int shipsLeftFirst = this.shipList.size();
    int shipsLeftInSecond = otherArmada.shipList.size();
    int battlenumber = 1;

    while (shipsLeftFirst > 0 && 0 < shipsLeftInSecond){
      System.out.println(battlenumber);
      battlenumber++;
      Ship nextShipinFirst = this.shipList.get(0);
      Ship nextShipinSecond = otherArmada.shipList.get(0);

      if (nextShipinFirst.battle(nextShipinSecond)){
        System.out.println("The first Ship won the battle!");
        otherArmada.shipList.remove(0);
        shipsLeftInSecond--;
      }else {
        System.out.println("The second  Ship won the battle!");
        this.shipList.remove(0);
        shipsLeftFirst--;
      }
    }
    armadaResults(shipsLeftFirst,shipsLeftInSecond);
  }
  private void armadaResults(int firstinLeft, int secondinLeft){
    if (firstinLeft ==0 ){
      System.out.println("Second Armada Won The Battle!");
    }
    else if (secondinLeft == 0){
      System.out.println("First Armada Won The Battle");
    }else {
      System.out.println("The Wind Blown Away the Ships!");
    }
  }
  private void shipDetails(Ship firstArmada, Ship secondArmada){
    System.out.println(firstArmada);
    System.out.println(secondArmada);
  }
}
