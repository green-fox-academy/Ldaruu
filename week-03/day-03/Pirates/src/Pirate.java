public class Pirate {
  private String name;
  private int rumlevel;
  private boolean passedOut;
  private boolean alive;
  private boolean hasParrot;
  private boolean isCaptain;
  private String captainName;


  public void drinkSomeRum() {
    if (alive) {
      rumlevel++;
    } else {
      rumlevel = 0;
    }
  }


  public void die() {
    alive = false;
    hasParrot = false;
  }

  public void howIsItGoingMate() {
    if (!alive) {
      System.out.println(" Dead people don't drink!");
    } else if (passedOut) {
      System.out.println("Pirate is passed out!");
      hasParrot = false;
    } else if (rumlevel <= 4) {
      System.out.println("Pour me anudder!");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      System.out.println(" The pirate is passed out");
      passedOut = true;
      hasParrot = false;
    }
  }

  public void brawl(Pirate this, Pirate pirateBrawl) {
    int chance = (int) (1 + Math.random() * 3);
    if (this.alive || pirateBrawl.alive) {
      System.out.println("No fight one of them is dead already!");
    }
    if (this.passedOut || pirateBrawl.passedOut) {
      System.out.println("No fight one of them is passed out!");
    } else {
      conditions(chance, this, pirateBrawl);
    }
  }

  private void conditions(int chance, Pirate pirateCall, Pirate pirateBrawl) {
    if (chance == 1) {
      System.out.println("Pirate 1 is the winner!");
      pirateBrawl.die();
    }
    if (chance == 2) {
      System.out.println("Pirate 2 is the winner!");
      pirateCall.die();
    }
    if (chance == 3) {
      System.out.println("They passed out!");
      pirateCall.passedOut = true;
      pirateBrawl.passedOut = true;
      hasParrot = false;
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean passedOut() {
    return passedOut;
  }

  public String passedOutText() {
    if (passedOut) {
      return "He is passed out";
    } else {
      return "He is ready to drink more!";
    }
  }

  public void setAsCaptain() {
    isCaptain = true;
  }

  public int getDrunkness() {
    return rumlevel;
  }

  public boolean isDead() {
    return !alive;
  }

  public String isDeadText() {
    if (alive) {
      return "He is alive";
    } else {
      return "He is Dead!";
    }
  }

  public void getStatus() {
//    System.out.println("Pirate name: "+name+",\t Rum level:"+drunkness+ ",\tPassed out: "+passedOut+",\tHas Parrot: "+hasParrot+",\tIs he dead: "+alive );
    if (alive) {
      System.out.println("Rum level: " + rumlevel);
      System.out.println("Has a Parrot: " + hasParrot);
      System.out.println("Passed out: " + passedOut);
      System.out.println("Is he alive: " + alive);


    }
  }
}
