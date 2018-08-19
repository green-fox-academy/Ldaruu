public class Pirate {
  int drunkness;
  String name;
  int health;
  boolean passedOut;
  boolean isDead;
  boolean hasParrot;
  boolean isCaptain;

  public Pirate() {
    drunkness = 0;
    health = 100;
    passedOut = false;
    isDead = false;
    this.name = name;
    hasParrot = true;
    isCaptain = false;
  }

  public void drinkSomeRum() {
    drunkness++;
  }

  public void die() {
    isDead = true;
    hasParrot = false;
  }

  public void howIsItGoingMate() {
    if (isDead) {
      System.out.println(name + " Dead people don't drink!");
    } else if (passedOut) {
      System.out.println(name + "pirate is passed out!");
      hasParrot = false;
    } else if (drunkness <= 4) {
      System.out.println("Pour me anudder!" + hasParrot);
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      System.out.println(name + " is passed out");
      passedOut = true;
      hasParrot = false;
    }
  }

  public void brawl(Pirate pirateCall, Pirate pirateBrawl) {
    int chance = (int) (1 + Math.random() * 3);
    if (pirateCall.isDead || pirateBrawl.isDead) {
      System.out.println("No fight one of them is dead already!");
    }
    if (pirateCall.passedOut || pirateBrawl.passedOut) {
      System.out.println("No fight one of them is passed out!");
    } else {
      conditions(chance, pirateCall, pirateBrawl);
    }
  }

  public void conditions(int chance, Pirate pirateCall, Pirate pirateBrawl) {
    if (chance == 1) {
      System.out.println("Pirate1 is the winner");
      pirateBrawl.die();
    }
    if (chance == 2) {
      System.out.println("Pirate2 is the winner!");
      pirateCall.die();
    }
    if (chance == 3) {
      System.out.println("They passed out!");
      pirateCall.passedOut = true;
      pirateBrawl.passedOut = true;
      hasParrot = false;
    }
  }


  public boolean passedOut() {
    return passedOut;
  }
  public void setAsCaptain(){
    isCaptain =true;
  }

  public int getDrunkness() {
    return drunkness;
  }

  public boolean isDead() {
    return isDead;
  }
  public void getStatus(){
    System.out.println("Pirate name: "+name+",\t Rum level:"+drunkness+ ",\tPassed out: "+passedOut+",\tHas Parrot: "+hasParrot+",\tIs he dead: "+isDead );
    }
}
