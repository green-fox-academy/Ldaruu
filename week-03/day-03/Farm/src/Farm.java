import java.util.ArrayList;
import java.util.List;

public class Farm {

  private List<Animal> allAnimals = new ArrayList<>();
  private int slot = 20;

  public void addAnimals() {
    allAnimals.add(new Animal());
    slot--;
  }

  public void breed() {
    if (slot > 0) {
      allAnimals.add(new Animal());
    }
    slot--;
  }

  public void slaughter() {
    int mostHungry = 0;
    int mostHungryIndex = 0;
    for (int index = 0; index < allAnimals.size(); index++) {
      int currentHunger = allAnimals.get(index).getHunger();
      if (mostHungry < currentHunger) {
        mostHungry = currentHunger;
        mostHungryIndex = index;
      }
    }
    allAnimals.remove(mostHungryIndex);
  }
  public List<Animal> getAllAnimals(){
    return allAnimals;
  }
}
