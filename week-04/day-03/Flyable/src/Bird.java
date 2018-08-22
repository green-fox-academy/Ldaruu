public class Bird extends Animal implements Flyable{

  public Bird(){

  }
  public Bird(String name){
    this.name=name;
  }

  @Override
  public String breed() {
    return "laying eggs,";
  }

  @Override
  public String move() {
    return "flying high on the sky.";
  }

  @Override
  public String land() {
    return "breaking with the wings and land on feet.";
  }

  @Override
  public String fly() {
    return "flies with wings";
  }

  @Override
  public String takeOff() {
    return "takes off horizontally ";
  }
}

