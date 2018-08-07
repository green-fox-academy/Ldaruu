import java.util.Arrays;

public class StringTest {
  public static void main(String[] args) {
     String myString = "trotosie";
     String myString2 = "Hello Ciao Holla";
     String [] myStringArray = myString.split(" ");
      System.out.println(Arrays.toString(myStringArray));
    String turtule = myString.substring(0, 2);  // cut out the letter between the indexes
    System.out.println(myString.replace("t", "w"));
    System.out.println(myString.equals(myString2));
    System.out.println(myString.compareTo(myString2));
    System.out.println(Arrays.toString(myString2.split(" ")));
    System.out.println(myString2.split(" ").length); // pringting out the length of the string (3 -caracters)
    System.out.println(myString2.split(" ")[2]); //spliting and printig out the string from index3
    System.out.println(myString +myString2); // adding the Strings together
    System.out.println(myString2.split(" ")[1].startsWith("Ci")); //checking the string on the index 1 if it starts with Ci

//      System.out.println(turtule);
//      System.out.println(turtule.charAt(0));
//    String turtule2 = "nosie";
//      System.out.println(turtule.equals(turtule2));
//      System.out.println(turtule.compareTo(turtule2));
  }
}
