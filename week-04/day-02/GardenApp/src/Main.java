public class Main {
  public static void main(String[] args) {
    Garden mygarden = new Garden();
    mygarden.addPlant(new Flower("yellow"));
    mygarden.addPlant(new Flower("blue"));
    mygarden.addPlant(new Tree("purple"));
    mygarden.addPlant(new Tree("orange"));
    mygarden.water(40);
    mygarden.getInfo();
    System.out.println();
    mygarden.water(70);
    mygarden.getInfo();
  }
}
