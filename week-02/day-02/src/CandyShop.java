import java.util.*;

public class CandyShop {
  public static void main(String... args){
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);

    // Accidentally we added "2" and "false" to the list.
    // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
    // No, don't just remove the lines
    // Create a method called sweets() which takes the list as a parameter.

    System.out.println(sweets(arrayList));
    // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
  }
  public static  ArrayList sweets(ArrayList arrayList) {
//    arrayList.set(0, "Croissant");
//    arrayList.set(3,"Ice Cream");
    arrayList.set(arrayList.indexOf(2),"Croissant");
    arrayList.set(arrayList.indexOf(false), "Ice cream");
    return arrayList;


  }
}