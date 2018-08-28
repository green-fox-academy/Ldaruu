package battle;

public abstract class BaseHero {

  private String name;

  public BaseHero(String name) {
    this.name = name;
  }

  public abstract void punch(Punchable other);

  public abstract int getMotivationLevel();

  public String getName() {
    return name;
  }
}
