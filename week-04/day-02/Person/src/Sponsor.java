public class Sponsor extends Person {
  String company;
  int hiredStudents;

  public Sponsor(String name, int age, String gender, String company) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
    this.hiredStudents = 0;
  }

  Sponsor() {
    name = "Jone Doe";
    age = 30;
    gender = "female";
    company = "Google";
    hiredStudents = 0;
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public void introduce() {
    System.out.println("Hello my nam is: " + name + ", I am  " + age + " old " + gender + " who represent "
        + company + " and hired: " + hiredStudents + " students so far.");
  }

  public void hire() {
    hiredStudents += 1;
  }

}
