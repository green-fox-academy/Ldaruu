package animals;

public class Mammal extends Animal {


  public Mammal() {

  }
  public Mammal(String name){
    this.name=name;
  }

  @Override
  public String breed() {
    return "pushing miniature versions out.";
  }

  @Override
  public String move() {
    return null;
  }
}
