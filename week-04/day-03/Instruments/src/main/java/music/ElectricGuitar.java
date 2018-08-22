package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    this.name = "Electric Guitar";
    this.numberOfString = 6;
  }

  public ElectricGuitar(int numOfString) {
    this.name = "Electric Guitar";
    this.numberOfString = numOfString;

  }

  @Override
  public String sound() {
    return "Twang";
  }
}
