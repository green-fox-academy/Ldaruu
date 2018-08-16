public class Main {
  public static void main(String[] args) {
    Car trabi = new Car();
    trabi.setGasAmount(40);
    Car tank = new Car();
    tank.setGasAmount(10);
    Station mol = new Station(1000);
    mol.refill(trabi);
    mol.refill(tank);
    System.out.println("Remaining gas amount on the station: " + mol.getGasAmount());
    System.out.println("Trabi is full " + trabi.getGasAmount() + "%");
    System.out.println(tank.getGasAmount());
  }
}
//  Create Station and Car classes
//    Station
//  gasAmount
//  refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
//    Car
//    gasAmount
//    capacity
//    create constructor for Car where:
//    initialize gasAmount -> 0
//    initialize capacity -> 100