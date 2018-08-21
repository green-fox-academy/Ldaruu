import java.util.ArrayList;
import java.util.List;

public class Garden {

  private List<Plant> plantsInGarden;

  public Garden() {
    plantsInGarden = new ArrayList<>();

  }

  public void addPlant(Plant plant) {
    plantsInGarden.add(plant);
  }

  public void water(double waterAmount) {
    System.out.println("Watering with " + waterAmount);
    double divider = countWaterable(this);
    double waterPerPlants = waterAmount / divider;
    this.waterPlants(waterPerPlants);
  }

  public void waterPlants(double waterbyPlants) {
    for (Plant currentPlant : plantsInGarden) {
      if (currentPlant.isWaterAble()) {
        currentPlant.waterPlant(waterbyPlants);
      }
    }
  }

  public double countWaterable(Garden waterbyPlants) {
    int counter = 0;

    for (Plant currentPlant : this.plantsInGarden) {
      if (currentPlant.isWaterAble()) {
        counter++;
      }
    }
    return counter;
  }

  public void getInfo() {
    String needsWater;
    for (Plant currentPlant : plantsInGarden) {
      if (currentPlant.isWaterAble()) {
        needsWater = " needs water";
      } else {
        needsWater = " does not need water";
      }
      System.out.println("The " + currentPlant.getColor() + " " + currentPlant.getType() + " " + needsWater);

    }
  }
}
