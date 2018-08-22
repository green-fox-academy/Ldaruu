

public class Helicopter extends Vehicle implements Flyable {

  public Helicopter(String name, int age, String color) {
    this.name = name;
    this.age = age;
    this.color = color;
  }


  @Override
  public String drive() {
    return "Driving with  pedals and a steering stick.";
  }

  @Override
  public String land() {
    return "ability to land in a small place vertically";
  }

  @Override
  public String fly() {
    return "flies with rotors";
  }

  @Override
  public String takeOff() {
    return "takes of vertically from a small place";
  }
}
