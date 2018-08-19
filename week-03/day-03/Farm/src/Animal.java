public class Animal {
  private int hunger = 50;
  private int thirst = 50;


  public void eat() {
    hunger--;
  }

  public void drink() {
    thirst--;
  }

  public void play() {
    hunger++;
    thirst++;
  }
  public int getHunger() {
    return hunger;
  }

  @Override
  public String toString() {
    return "Animal[" +
        "hunger=" + hunger +
        ", thirst=" + thirst +
        ']';
  }
}
