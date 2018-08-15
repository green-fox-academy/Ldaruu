public class Station {

  private int gasAmount;

  public  void refill(Car car){
    int gasNeed = car.getGasAmount()-car.getCapacity();
    this.gasAmount -=gasNeed;
    car.setGasAmount(car.getCapacity());
  }
  public int getGasAmount(){
    return gasAmount;
  }
}
