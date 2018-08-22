package main.java.music;

public class Violin extends StringedInstrument {

  public Violin() {
    this.name = "Violin";
    this.numberOfString = 4;
  }

  public Violin(int numOfString) {
    this.name = "Violin";
    this.numberOfString = numOfString;

  }

  @Override
  public String sound() {
    return "Screech";
  }
}
