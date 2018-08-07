import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
  public static void main(String[] args) {
    ArrayList<Integer> converted = new ArrayList<>(Arrays.asList(1, 3, 4, 5));  //creating an Ineger ArrayList with element inside
    ArrayList<String> empty = new ArrayList<>();                                //creating an empty ArrayList
//    System.out.println(converted.size());                                     //cheking the size of the arrayalist
//    empty.add("Bela");                                                        //  adding elements to the arrayList
//    System.out.println(empty.get(0));                                         // printig out the element from the 0 index

//    for (int i = 0; i< converted.size(); i++) {
//      int temp = converted.get(i);
//      converted.set(i, temp + 3);                                              //add 3 to all of the elements
//      converted.set(i, 3)                                                      // convert all the element for 3
//      System.out.println(converted.get(i));                                    //with a for loop we can print out the arrayList


    for (Integer eLement : converted) {
      System.out.println(eLement);                                                // also printing out the ArrayList
    }

  }
}
