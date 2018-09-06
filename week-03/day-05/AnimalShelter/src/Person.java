import java.util.ArrayList;
import java.util.List;

public class Person extends Shelter {
  private String name;
  private List<Animal> myanimals;

  public Person(String name) {
    this.name = name;
    myanimals = new ArrayList<>();
  }

  public void adoptAnimal(Animal animal) {
    if (!animal.getOwner().equals("Shelter")) {
      System.out.println("The animal has owner already!");
    } else {
      shelter.remove(animal);
      myanimals.add(animal);
      animal.setOwner(this.name);
    }
  }

  public String getName() {
    return name;
  }

  //
  public void getMyAnimals() {
    System.out.println(myanimals.toString());

  }
}
