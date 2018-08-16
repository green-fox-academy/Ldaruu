public class Station {

  private int gasAmount;

  Station(int gasAmount) {
    this.gasAmount = gasAmount;
  }

  public void refill(Car car) {
    int gasNeed = car.getCapacity() - car.getGasAmount();
    this.gasAmount -= gasNeed;
    car.setGasAmount(car.getCapacity());
  }

  public int getGasAmount() {
    return gasAmount;
  }
}
