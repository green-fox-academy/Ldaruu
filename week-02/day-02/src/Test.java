import java.util.ArrayList;
import java.util.*;

public class Test {
  public static void main (String[]args){
    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    for (int i=0; i< arrayList.size(); i +=2){
      System.out.println(arrayList.get(i));
    }
}
}
