public class Main {
  public static void main(String[] args) {
    Animal dog1 = new Animal("boby", "dog", "Shelter");
    Animal dog2 = new Animal("tobu", "dog", "Shelter");
    Animal dog3 = new Animal("morzsi", "dog", "Shelter");
    Animal dog4 = new Animal("alex", "dog", "Shelter");
    Animal dog5 = new Animal("rex", "dog", "Shelter");
    Shelter home = new Shelter();
    home.acceptAnimal(dog1);
    home.acceptAnimal(dog2);
    home.acceptAnimal(dog3);
    home.acceptAnimal(dog4);
    home.acceptAnimal(dog5);
//    home.getShelter();

    Person tom = new Person("Tom");
    Person petra = new Person("Petra");
    tom.adoptAnimal(dog1,home);
    tom.adoptAnimal(dog3,home);
    petra.adoptAnimal(dog1,home);
    petra.adoptAnimal(dog2,home);
    petra.adoptAnimal(dog5,home);
//    tom.getMyAnimals();
//    petra.getMyAnimals();
    home.getShelter();
//    System.out.println(dog1.getOwner());
//    petra.getMyAnimals();
  }
}
