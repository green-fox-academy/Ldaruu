import java.util.ArrayList;
import java.util.List;

public class Shelter {
  List<Animal> shelter = new ArrayList<>();
  Animal animal;

  public Shelter(Animal animal) {
    this.animal=animal;
  }

  public Shelter() {
  }

  public Animal getAnimal() {
    return animal;
  }
  public void removeAnimal(Animal animal){
    shelter.remove(animal);
  }

  public void acceptAnimal(Animal animal) {
    shelter.add(animal);
  }
  //add removing animals from the list!

  public void getShelter() {
    System.out.println(shelter.toString());
  }
}
