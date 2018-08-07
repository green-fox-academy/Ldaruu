import java.util.*;

public class Matchmaking {
  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));
    System.out.println(makingMatches(girls, boys));
  }

  public static List makingMatches(ArrayList girls, ArrayList boys) {
    for (int i = 0; i < boys.size() - 1; i++) {

      girls.add(i * 2, boys.get(i));
    }
    return girls;
  }
}

// Write a method that joins the two lists by matching one girl with one boy into a new list
// Exepected output: "Eve", "Joe", "Ashley", "Fred"...




