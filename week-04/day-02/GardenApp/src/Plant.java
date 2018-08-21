public class Plant {
  private String color;
  private double waterlevel;
  private String type;

  Plant(String color) {
    this.color = color;
    waterlevel = 0;
  }

  public boolean isWaterAble() {       // Checking if the plant is water able
    if (this instanceof Tree) {
      return (this.getWaterlevel() < 10);
    } else {
      return (this.getWaterlevel() < 5);
    }
  }

  public void waterPlant(double waterAmount) {
    if (this instanceof Tree) {
      ((Tree) this).water(waterAmount);
    } else {
      ((Flower) this).water(waterAmount);
    }
  }

  //   Setter and Getter

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getColor() {
    return color;
  }

  public double getWaterlevel() {
    return waterlevel;
  }

  public void setWaterlevel(double waterlevel) {
    this.waterlevel = waterlevel;
  }

  public void setColor(String color) {
    this.color = color;
  }
}