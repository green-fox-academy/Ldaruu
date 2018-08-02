import java.sql.SQLOutput;

public class DefineBasicInfo {
  public static void main(String[] args) {
    // Define several things as a variable then print their values
    // Your name as a string
    // Your age as an integer
    // Your height in meters as a double
    // Whether you are married or not as a boolean
    String name = ("Laszlo");
    int age = 32;
    double height = 1.85;
    boolean marriage = false;
    System.out.println("My name is: "+ name);
    System.out.println("I am " + height + "-m tall");
    if (marriage == false){
      System.out.printf("Not married");
    }

  }
}
