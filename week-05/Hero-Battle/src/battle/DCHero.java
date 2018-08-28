package battle;

public class DCHero extends Hero {
  protected String universe = "DC";

  public DCHero(String name) {
    super(name);
    super.motivation = 45;

  }

  public DCHero(String name, int motivation) {
    super(name, motivation);
  }

  @Override
  public void punch(Punchable other) {
    if (!universe.equals("DC")) {
      if (getMotivation() >= 1) {
        double damage = motivation / 1.5;
        bePunched(damage);
        System.out.println("Punching MarvelHero!");
      } else {
        System.out.println("I am not motivated!");
      }

    }
  }
}
