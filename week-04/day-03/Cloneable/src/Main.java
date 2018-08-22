public class Main {
  public static void main(String[] args) {

    Student john = new Student();
    john.name ="John";
    john.age =22;
    john.gender="male";
    john.previousOrganization ="BME";

    john.clone(john).introduce();
    john.introduce();
    System.out.println(john);
    System.out.println(john.clone(john));

  }

}