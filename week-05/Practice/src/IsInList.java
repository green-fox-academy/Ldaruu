import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsInList {
  public static void main(String... args){
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
    System.out.println(checkNums(list));
    // Check if list contains all of the following elements: 4,8,12,16
    // Create a method that accepts list as an input
    // it should return "true" if it contains all, otherwise "false"

  }
  public static boolean checkNums(ArrayList<Integer>arrayList){
    List<Integer>mylist =new ArrayList<>(Arrays.asList(4,8,12,16));
    if (arrayList.containsAll(mylist)){
      return true;
    }
    return false;
  }
}
