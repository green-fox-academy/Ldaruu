public class Student extends Person {
  String previousOrganization;
  int skipDays;

  public Student(String name, int age, String gender, String previousOrganization){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    this.skipDays = 0;
  }

  Student() {
    name = "Jone Doe";
    age = 30;
    gender = "female";
    previousOrganization = "The School of Life";
    skipDays = 0;
  }

  public void skipDays(int numberOfDays) {
    skipDays += numberOfDays;
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void introduce() {
    System.out.println("Hello my nam is: " + name + ", I am  " + age + " old " + gender + " from " + previousOrganization +
        " who skipped " + skipDays + " days from the course already.");
  }
}
