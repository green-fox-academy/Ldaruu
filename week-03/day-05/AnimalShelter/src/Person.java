import java.util.ArrayList;
import java.util.List;

public class Person extends Shelter {
  private String name;
  private List<Animal> myanimals;

  public Person(String name) {
    this.name = name;
    myanimals = new ArrayList<>();
  }

  public void adoptAnimal(Animal animal,Shelter shelter) {
    if (!animal.getOwner().equals("Shelter")) {
      System.out.println("The animal has owner already!");
    } else {
      this.myanimals.add(animal);
      animal.setOwner(this.name);
      shelter.removeAnimal(animal);

    }
  }

  public String getName() {
    return name;
  }

  //
  public void getMyAnimals() {
    for (int i = 0; i < myanimals.size(); i++) {
      System.out.println(myanimals.get(i));

    }
//    System.out.println(myanimals.toString());

  }
}
