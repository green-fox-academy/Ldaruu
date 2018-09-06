import java.util.ArrayList;
import java.util.List;

public class Person extends Shelter {
  private String name;
  public List<Animal> myanimals;

  public Person(String name) {
    this.name = name;
    myanimals = new ArrayList<>();
  }

  public void adoptAnimal(Animal animal) {
    shelter.remove(animal);
    myanimals.add(animal);
    animal.setOwner(this.name);
  }
  
  public String getName() {
    return name;
  }

  //
  public void getMyAnimals() {
    System.out.println(myanimals.toString());

  }
}
