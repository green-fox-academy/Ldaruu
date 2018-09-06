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
    home.getShelter();

    Person tom= new Person("Tom");
    tom.adoptAn(dog1);


  }
}
