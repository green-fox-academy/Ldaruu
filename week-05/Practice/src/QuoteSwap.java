import java.util.ArrayList;
import java.util.Arrays;

public class QuoteSwap {
  public static void main(String... args){
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place
    // Your task is to fix it by swapping the right words with code
    // Create a method called quoteSwap().

    // Also, print the sentence to the output with spaces in between.
    System.out.println(quoteSwap(list));
    // Expected output: "What I cannot create I do not understand."

  }
  public static String quoteSwap(ArrayList<String>arrayList){
    int indexofDo = arrayList.indexOf("do");
    int indexofCannot= arrayList.indexOf("cannot");
    arrayList.set(indexofCannot,"do");
    arrayList.set(indexofDo,"cannot");
    String myList="";
    for (int i = 0; i <arrayList.size() ; i++) {
      myList += arrayList.get(i) +" ";
    }
    return myList;

  }

}
