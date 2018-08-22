package animals;

public class Reptile  extends Animal{

  public Reptile(){

  }
  public Reptile(String name){
    this.name=name;
  }

  @Override
  public String breed() {
    return "laying eggs.";
  }

  @Override
  public String move() {
    return "running quickly and shacking the tail.";
  }
}
