import java.lang.reflect.Array;
import java.util.*;

public class SolarSystem {
  public static void main(String... args) {
    ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));

    System.out.println(putSaturn(planetList));

  }

  public static List putSaturn(ArrayList planetList) {

    planetList.add(5,"Saturn");

    return planetList;


    // Saturn is missing from the planetList
    // Insert it into the correct position
    // Create a method called putSaturn() which has list parameter and returns the correct list.


    // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"
  }
}
