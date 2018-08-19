public class Battle {
  public static void main(String[] args) {
    Ship first =new Ship();
    Ship second =new Ship();
    first.fillShip();
    second.fillShip();
    first.captainStatus();
    first.battle(second);
    second.crewStatus();



  }
}
