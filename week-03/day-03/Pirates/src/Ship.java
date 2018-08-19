import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  ArrayList<Pirate> shipCrew = new ArrayList<>();
  int captainIndex = 0;

  public void fillShip() {
    Random random = new Random();
    int crew = random.nextInt(50);
    for (int i = 0; i < crew; i++) {
      shipCrew.add(new Pirate());
    }
    setCaptain();
  }

  private void setCaptain() {
    int indexofCaptain = (int) (Math.random() * shipCrew.size());
    shipCrew.get(indexofCaptain).setAsCaptain();
    captainIndex = indexofCaptain;
  }

  public int aliveCrew() {
    int alive = 0;
    for (int i = 0; i < shipCrew.size(); i++) {
      if (shipCrew.get(i).health > 0) {
        alive++;
      }
    }
    return alive;
  }

  public int captainStatus() {
    int rum = 100 - shipCrew.get(0).drunkness;
    int hedrank = 100 - rum;
    return hedrank;
  }

  private int getCaptainIndex() {
    return captainIndex;
  }

  private List<Pirate> getShipcrew() {
    return shipCrew;
  }

  public void crewStatus() {
    System.out.println("We have: " + aliveCrew() + " pirates alive!");
    System.out.println("The captain has drank " + captainStatus() + "rums.");
  }

  public boolean battle(Ship otherShip) {
    int[] shipScore = calculateScore(this, otherShip);
    if (shipScore[0] > shipScore[1]) {
      this.party();
      otherShip.addDeaths();
      return true;
    }else {
      this.addDeaths();
      otherShip.party();
      return false;
    }
  }

  private int[] calculateScore(Ship thisShip, Ship otherShip) {
    List<Pirate> thisShipCrew = thisShip.getShipcrew();
    List<Pirate> otherShipCrew = otherShip.getShipcrew();

    int[] shipScore = new int[2];
    shipScore[0] = aliveCrew() - thisShipCrew.get(thisShip.getCaptainIndex()).getDrunkness();
    shipScore[1] = aliveCrew() - otherShipCrew.get(thisShip.getCaptainIndex()).getDrunkness();
    return shipScore;
  }

  private int alivecounter(List<Pirate> shipCew) {
    int counter = 0;
    for (Pirate countPirates : shipCew) {
      if (!countPirates.isDead) {
        counter++;
      }
    }
    return counter;
  }

  private void addDeaths() {
    int aliveCrew = alivecounter(shipCrew);
    int deaths = (int) (1 + Math.random() * aliveCrew);
    System.out.println("Deaths from the looser ship:" + deaths);
    if (aliveCrew > 0) {
      for (int i = 0; i < shipCrew.size(); i++) {
        if (!shipCrew.get(i).isDead()) {
          shipCrew.get(i).die();
          deaths--;
        }
        if (deaths <= 0) {
          break;
        }
      }

    }
  }
  public void party(){
    Random random = new Random();
    int rumsToDrink = random.nextInt(20);
    System.out.println("The winner ship gets:"+ rumsToDrink +"bottles of Rum!");
    while (rumsToDrink>0){
      int piratesIndex = (int)((Math.random()* shipCrew.size()));
      shipCrew.get(piratesIndex).getDrunkness();
      rumsToDrink--;
    }

  }
}
