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
      super.punch(other);
      }
  }
}
