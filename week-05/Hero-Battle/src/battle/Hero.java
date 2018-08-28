package battle;

public class Hero extends BaseHero implements Punchable {

  protected double motivation;


  public Hero(String name, int motivation) {
    super(name);
    this.motivation = motivation;
  }

  public Hero(String name) {
    super(name);
  }

  @Override
  public void punch(Punchable other) {
//    if (motivation >= 1) {
//      double damage = motivation / 1.5;
//      bePunched(damage);
//    } else {
//      System.out.println("Im not motivated!");
//    }

  }

  @Override
  public int getMotivationLevel() {
    int motivationlvl = 0;
    if (this.motivation < 25) {
      motivationlvl = 0;
    } else if (this.motivation >= 25 && this.motivation <= 40) {
      motivationlvl = 1;
    } else if (motivationlvl > 40) {
      motivationlvl = 2;
    }
    return motivationlvl;
  }

  public String toString() {
    String status = "";
    if (getMotivationLevel() == 0) {
      status = getName() + " is not motivated anymore!";
    } else if (getMotivationLevel() == 1) {
      status = getName() + " is motivated!";
    } else if (getMotivationLevel() ==2){
      status = getName() + " is well motivated!";
    }
    return status;
  }

  @Override
  public void bePunched(double damage) {
    this.motivation -= damage / this.motivation;
  }

  public double getMotivation() {
    return motivation;
  }
}
