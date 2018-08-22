package main.java.music;

public abstract class StringedInstrument extends Instrument {

  public int numberOfString;


  public abstract String sound();

  @Override
  public void play() {
    System.out.println( name +", a " + numberOfString + "-stringed instrument that goes " + sound());
    sound();

  }
}
