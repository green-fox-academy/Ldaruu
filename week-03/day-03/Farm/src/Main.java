import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
//    Creating the farm with 12 animals
    Farm myFarm = new Farm();
    for (int i = 0; i < 12; i++) {
      myFarm.addAnimals();
    }
    System.out.println(myFarm.getAllAnimals().size());
//    Breeds 8 animals on the Farm
    for (int i = 0; i < 8; i++) {
      myFarm.breed();
    }
    System.out.println(myFarm.getAllAnimals().size());
//    Farm is full we cant breed more
    myFarm.breed();
    System.out.println(myFarm.getAllAnimals().size());
//   Slaughtering the 4 most hungry animal
    for (int i = 0; i < 3; i++) {
      myFarm.slaughter();
    }
    myFarm.breed();
    System.out.println(myFarm.getAllAnimals().size());
//    Breeds 4 new Animals to the Farm due to the free places, however its 17 peaces as we slaughtering  the 3 hungriest one always
    for (int i = 0; i < 3; i++) {
      myFarm.breed();
    }
    System.out.println(myFarm.getAllAnimals().size());
  }
}
