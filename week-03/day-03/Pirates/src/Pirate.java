import java.util.Random;

public class Pirate {

  int drunkness;
  String name;
  int health;
  boolean passedOut;
  boolean isDead;

  public Pirate(String name) {
    drunkness = 0;
    health = 100;
    this.passedOut = false;
    this.isDead = false;
    this.name = name;
  }

  public void drinkSomeRum() {
    drunkness++;
  }

  public void die() {
    isDead = true;
  }

  public void howIsItGoingMate() {
    if (isDead) {
      System.out.println(name + " he does not need any more drink he is dead!");
    } else if (passedOut) {
      System.out.println(name + "pirate is passed out!");
    } else if (drunkness <= 4) {
      System.out.println("Pour me anudder!");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      System.out.println(name + " is passed out");
      passedOut = true;
    }
  }

  public void brawl(Pirate pirateBrawl) {
    int chance = (int) (1 + Math.random() * 3);
    if (isDead || pirateBrawl.isDead) {
      System.out.println("No fight one of them is dead already!");
    }
    if (passedOut || pirateBrawl.passedOut) {
      System.out.println("No fight one of them is passed out!");
    } else {
      conditions(chance, this, pirateBrawl);
    }
  }

  public void conditions(int chnce, Pirate pirate1, Pirate pirate2) {
    if (chnce == 1) {
      System.out.println("Pirate1 is the winner");
      pirate2.die();
    }
    if (chnce == 2) {
      System.out.println("Pirate2 is the winner!");
      pirate1.die();
    } else {
      System.out.println("They passed out!");
      pirate1.passedOut = true;
      pirate2.passedOut = true;
    }

  }

  public boolean passedOut() {
    return passedOut;
  }
  public int getDrunkness() {
    return drunkness;
  }

  public boolean isDead() {
    return isDead;
  }
}
