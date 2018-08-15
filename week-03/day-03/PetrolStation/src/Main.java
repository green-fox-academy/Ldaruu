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
    System.out.println(trabi.getGasAmount());
    System.out.println(tank.getGasAmount());
  }
}
