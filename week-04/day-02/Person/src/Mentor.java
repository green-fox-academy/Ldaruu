public class Mentor extends Person {
  String level;

  public Mentor(String name, int age, String gender, String level) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = level;
  }

  Mentor() {
    name = "Jone Doe";
    age = 30;
    gender = "female";
    level = "intermediate";
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  public void introduce() {
    System.out.println("Hello my nam is: " + name + ", I am  " + age + " old " + gender + " I am an " + level + " level Mentor.");
  }
}
