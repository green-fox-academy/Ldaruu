import java.util.*;

public class StudentCounter {
  public static void main(String... args) {
    ArrayList<Map<String, Object>> map = new ArrayList<Map<String, Object>>();

    // Given this list of hashmaps...

    Map<String, Object> row0 = new HashMap<String, Object>();
    row0.put("name", "Theodor");
    row0.put("age", 9.5);
    row0.put("candies", 2);
    map.add(row0);

    Map<String, Object> row1 = new HashMap<String, Object>();
    row1.put("name", "Paul");
    row1.put("age", 10.0);
    row1.put("candies", 1);
    map.add(row1);

    Map<String, Object> row2 = new HashMap<String, Object>();
    row2.put("name", "Mark");
    row2.put("age", 7.0);
    row2.put("candies", 3);
    map.add(row2);

    Map<String, Object> row3 = new HashMap<String, Object>();
    row3.put("name", "Peter");
    row3.put("age", 12.0);
    row3.put("candies", 5);
    map.add(row3);

    Map<String, Object> row4 = new HashMap<String, Object>();
    row4.put("name", "Olaf");
    row4.put("age", 12.0);
    row4.put("candies", 7);
    map.add(row4);

    Map<String, Object> row5 = new HashMap<String, Object>();
    row5.put("name", "George");
    row5.put("age", 3.0);
    row5.put("candies", 2);
    map.add(row5);

    System.out.println("The following students ha more than 4 candies: ");

    double sum = 0;

    for (int i = 0; i < map.size(); i++) {
      if ((Integer) (map.get(i).get("candies")) >= 4) {
        System.out.print(map.get(i).get("name") + " ");
      }
    }
    for (int k = 0; k <map.size(); k++) {
      if ((int) (map.get(k).get("candies")) < 5) {
        sum += Double.valueOf(map.get(k).get("age").toString());
      }
    }
    System.out.println();
    System.out.println("The sum age of the kids who has less than 5 candies: " + sum);

    // Display the following things:
    //  - Who has got more candies than 4 candies
    //  - Sum the age of people who have lass than 5 candies
  }
}