import java.util.ArrayList;
import java.util.List;

public class Person {
  private String name;
  public List<Animal> myanimals;

  public Person(String name) {
    this.name = name;
    myanimals = new ArrayList<>();
  }

  public void adoptAn(String name) {
    myanimals.add(name);
  }

  public String getName() {
    return name;
  }

  public List<Animal> getMyanimals() {
    return myanimals;
  }
}
