public class PrintParam02 {
  public static void main(String[] args) {
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")
// ...

    printParms( "first", "Second", "Third");
  }

  public static void printParms(String ... stringParms) {
    System.out.println("Number of arguments: "+stringParms.length);

    for (int i = 0; i < stringParms.length; i++) {
      System.out.print(stringParms[i] + " ");
    }
  }
}

//  https://www.geeksforgeeks.org/variable-arguments-varargs-in-java/

