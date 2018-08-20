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

  private int aliveCrew() {
    int alive = 0;
    for (Pirate currentPirate : shipCrew) {
      if (!currentPirate.isDead()) {
        alive++;
      }
    }
    return alive;
  }

  private int getCaptainIndex() {
    return captainIndex;
  }

  private List<Pirate> getShipcrew() {
    return shipCrew;
  }

  private List<Object> captainStatus(int captainIndex, List<Pirate> shipCrew) {
    Pirate captain = shipCrew.get(captainIndex);

    List<Object> statuses = new ArrayList<>();
    statuses.add(captain.getDrunkness());
    statuses.add(captain.isDeadText());
    statuses.add(captain.passedOutText());

    return statuses;
  }

  public String crewStatus() {
    List<Object> status = captainStatus(captainIndex, shipCrew);
    int counter = alivecounter(shipCrew);

    return "Ship:\n" + "Captain's Rum level" + status.get(0) + "\n" + "Captain state: " + status.get(1) + "\t" + status.get(2) + "\n" +
        "Number of alive crew member: " + counter;
  }

  private int alivecounter(List<Pirate> shipCew) {
    int counter = 0;
    for (Pirate countPirates : shipCew) {
      if (countPirates.isDead()) {
        counter++;
      }
    }
    return counter;
  }

  public boolean battle(Ship otherShip) {
    int[] shipScore = calculateScore(this, otherShip);
    if (shipScore[0] > shipScore[1]) {
      this.party();
      otherShip.addDeaths();
      return true;
    } else {
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

  public void party() {
    Random random = new Random();
    int rumsToDrink = random.nextInt(20);
    System.out.println("The winner ship gets:" + rumsToDrink + "bottles of Rum!");
    while (rumsToDrink > 0) {
      int piratesIndex = (int) ((Math.random() * shipCrew.size()));
      shipCrew.get(piratesIndex).drinkSomeRum();
      shipCrew.get(captainIndex).drinkSomeRum();
      rumsToDrink--;
    }

  }
}
