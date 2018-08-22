package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    this.name = "Bass Guitar";
    this.numberOfString = 4;
  }

  public BassGuitar(int numOfString) {
    this.name = "Bass Guitar";
    this.numberOfString = numOfString;

  }
    @Override
    public String sound () {
      return "Dumm-dumm-dumm";
    }
  }
