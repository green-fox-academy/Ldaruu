import java.util.HashMap;
import java.util.Map;

public class HashMapPracc {
  public static void main(String[] args) {

    Map<String, Integer> map = new HashMap<>();
    map.put("alme", 2);
    map.put("apple", 5);
    map.put("peach", 4);
    map.put("greaps", 6);

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

    }

    Map<Integer, Integer> mymap = new HashMap<>();
    mymap.put(1, 2);
    mymap.put(3, 4);
    mymap.put(1, 5);
    mymap.put(5, 5);
//iterating over keys only
    for ( Integer key : mymap.keySet()) {
      System.out.println("Key = " + key);
    }
//iterating over values only
    for (Integer value : mymap.values()) {
      System.out.println("Value = " + value);
    }
  }

}