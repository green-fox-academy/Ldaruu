import java.util.ArrayList;
import java.util.List;

public class Garden {

  private List<Plant> plantsInGarden;

  public Garden() {
    plantsInGarden = new ArrayList<>();

  }

  public void addPlant(Plant plant) {        // Adding plants to my garden
    plantsInGarden.add(plant);
  }

  public void water(double waterAmount) {                     // Watering the plants in the garden with a double amount
    System.out.println("Watering with " + waterAmount);
    double divider = countWaterable(this);
    double waterPerPlants = waterAmount / divider;
    this.waterPlants(waterPerPlants);
  }

  public void waterPlants(double waterbyPlants) {            //Checking if the current pant is thirsty and watering it wit a double amount
    for (Plant currentPlant : plantsInGarden) {
      if (currentPlant.isWaterAble()) {
        currentPlant.waterPlant(waterbyPlants);
      }
    }
  }

  public double countWaterable(Garden waterbyPlants) {      // Checking the garden which plants are thirsty
    int counter = 0;

    for (Plant currentPlant : this.plantsInGarden) {
      if (currentPlant.isWaterAble()) {
        counter++;
      }
    }
    return counter;
  }

  public void getInfo() {                               // Getting info of the Garden plants
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
