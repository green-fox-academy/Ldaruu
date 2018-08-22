public class Person {
  String name;
  int age;
  String gender;

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  Person() {
    name = "Jone Doe";
    age = 30;
    gender = "female";
  }

  public void introduce() {
    System.out.println("Hello my nam is: " + name + ", I am  " + age + " old " + gender);
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }
}

