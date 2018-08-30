package battle;

public class MarvelHero extends Hero {
  protected String universe = "Marvel";

  public MarvelHero(String name) {
    super(name);
    super.motivation = 40;
  }

  public MarvelHero(String name, int motivation) {
    super(name, motivation);
  }

  @Override
  public void punch(Punchable other) {
    if (!universe.equals("Marvel")) {
      super.punch(other);
    }
  }
}
