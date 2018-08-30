import java.util.ArrayList;
import java.util.Arrays;

public class Matchmaking {
  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

    // Write a method that joins the two lists by matching one girl with one boy into a new list
    // Exepected output: "Eve", "Joe", "Ashley", "Fred"...
    System.out.println(makingMatches(girls, boys));
  }

  public static ArrayList makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
    ArrayList<String> matchmakig = new ArrayList<>();
    int shorter;
    if (girls.size() < boys.size()) {
      shorter = girls.size();
    } else
      shorter = boys.size();
    for (int i = 0; i < shorter; i++) {
      matchmakig.add(girls.get(i));
      matchmakig.add(boys.get(i));
    }
    return matchmakig;
  }
}