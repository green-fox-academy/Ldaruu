import java.util.List;

public class Tree extends Plant {

  private static final double WATER_ABSORV = 0.4;

  Tree(String color){
    super(color);
    this.setType("Tree");
  }


  public void water(double waterAmount) {
    this.setWaterlevel(this.getWaterlevel() + waterAmount * WATER_ABSORV);

  }
}
