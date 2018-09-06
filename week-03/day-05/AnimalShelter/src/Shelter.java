import java.util.ArrayList;
import java.util.List;

public class Shelter {
  List<Animal> shelter = new ArrayList<>();

  public Shelter() {
  }

  public void acceptAnimal(Animal animal) {
    shelter.add(animal);
  }

  public  void  getShelter() {
    System.out.println(shelter.toString());
  }
}
