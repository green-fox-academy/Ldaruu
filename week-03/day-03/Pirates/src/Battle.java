public class Battle {
  public static void main(String[] args) {
    Ship rozi =new Ship();
    Ship fortune = new Ship();

   fortune.fillShip();
   rozi.fillShip();
   rozi.battle(fortune);
   rozi.crewStatus();
    System.out.println();
   fortune.crewStatus();


  }
}
