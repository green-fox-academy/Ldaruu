import java.util.ArrayList;

public class SubStrList {
  public static void main(String[] args) {
//  Create a function that takes a string and a list of string as a parameter
    //  Returns the index of the string in the list where the first string is part of
    //  Only need to find the first occurence and return the index of that
    //  Returns `-1` if the string is not part any of the strings in the list

    //  Example
    String[] searchArr = new String[]{"this", "is", "what", "I'm", "searching"};
    System.out.println(subStrList("ching", searchArr));
    //  should print: `4`
    System.out.println(subStrList("not", searchArr));
    //  should print: `-1`
  }

  public static int subStrList(String searchword, String[] list) {
    int result = -1;                          // set the result -1 as it would not contain the search word
    for (int x = 0; x < list.length; x++) {   // go through the list
      if (list[x].contains(searchword)) {    // if the element on the [x] index contains the search word
        result = x;
      }
    }
      return result;

    }
  }

