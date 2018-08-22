package animals;

public class Bird extends Animal {

  public Bird(){

  }
  public Bird(String name){
    this.name=name;
  }

  @Override
  public String breed() {
    return "laying eggs.";
  }

  @Override
  public String move() {
    return "Flying high";
  }
}
