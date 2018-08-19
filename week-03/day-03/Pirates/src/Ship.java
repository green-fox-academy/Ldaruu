import java.util.ArrayList;
import java.util.Random;

public class Ship {
  ArrayList<Pirate> blackPearl = new ArrayList<>();
  Pirate captain = new Pirate();
  Pirate seaman = new Pirate();

  public Ship() {
    captain.health = 100;

  }

  public ArrayList fillShip() {
    Random random = new Random();
    int crew = random.nextInt(50);
    blackPearl.add(0, captain);
    for (int i = 1; i < crew; i++) {
      blackPearl.add(i, seaman);
    }
    return blackPearl;
  }

  public int aliveCrew() {
    int alive = 0;
    for (int i = 0; i < blackPearl.size(); i++) {
      if (blackPearl.get(i).health > 0) {
        alive++;
      }
    }
    return alive;
  }

  public int captainDrinking() {
    int rum = 100 - blackPearl.get(0).drunkness;
    int hedrank =100-rum;
    return hedrank;
  }

  public void crewStatus() {
    System.out.println("We have: " + aliveCrew() + " pirates alive!");
    System.out.println("The captain has drank " + captainDrinking() + "rums.");
  }

  public boolean battle(Ship otherSip) {
    boolean result;
    Random luck = new Random();
    int blackPLoose = luck.nextInt(blackPearl.size() - 1);
    int theyLoose = luck.nextInt(otherSip.blackPearl.size() - 1);
    int rum = luck.nextInt(10);
    if (aliveCrew() - captainDrinking() > otherSip.aliveCrew() - otherSip.captainDrinking()) {
      for (int i = 0; i < otherSip.blackPearl.size(); i++) {
        otherSip.blackPearl.remove(i);
      }
      for (int i = 0; i < rum; i++) {
        captain.drunkness++;
        seaman.drunkness++;
      }
    } else {
      for (int i = 0; i < blackPearl.size(); i++) {
        blackPearl.remove(i);
        }
        for (int i = 0; i < blackPearl.size(); i++) {
          otherSip.captain.drunkness++;
          otherSip.seaman.drunkness++;
        }
      }
    return (aliveCrew() - captainDrinking() < otherSip.aliveCrew() - otherSip.captainDrinking());
  }
}
