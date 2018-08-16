public class Car {
  private int capacity;
  private int gasAmount;

  Car() {
    capacity = 100;
    gasAmount = 0;
  }

  public int getCapacity() {
    return capacity;
  }

  public int getGasAmount() {
    return gasAmount;
  }

  public void setGasAmount(int gasAmount) {
    this.gasAmount = gasAmount;
  }

}


