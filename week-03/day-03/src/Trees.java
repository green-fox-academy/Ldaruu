import java.util.HashMap;
import java.util.Map;

public class Trees {
  public static void main(String[] args) {
    Map<String, Object> treeOne = new HashMap<>();
    treeOne.put("type", "Oak");
    treeOne.put("leaf color", "Green");
    treeOne.put("age", 99);
    treeOne.put("sex", "Monoecious");

    Map<String, Object> treeTwo = new HashMap<>();
    treeTwo.put("type", "Brich");
    treeTwo.put("leaf color", "Green");
    treeTwo.put("age", 102);
    treeTwo.put("sex", "Monoecious");

    Map<String, Object> treeThree = new HashMap<>();
    treeThree.put("type", "Poplar");
    treeThree.put("leaf color", "Green");
    treeThree.put("age", 155);
    treeThree.put("sex", "Dioecious");

    Map<String, Object> treeFour = new HashMap<>();
    treeFour.put("type", "Acacias");
    treeFour.put("leaf color", "Green");
    treeFour.put("age", 13);
    treeFour.put("sex", "Monoecious");

    Map<String, Object> treeFive= new HashMap<>();
    treeFive.put("type", "Pine");
    treeFive.put("leaf color", "Green");
    treeFive.put("age", 3);
    treeFive.put("sex", "Monoecious");
  }
}
