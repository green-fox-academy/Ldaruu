import java.util.Scanner;

public class PrintParms {

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
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Number of the elements?");
  int numOfParameter = input.nextInt();
  String[] parameters = new String[numOfParameter];
  input.nextLine();


  for (int i = 0; i < numOfParameter; i++) {
    System.out.println("Please enter a parameter: ");
    parameters[i] = input.nextLine();
  }
    printer(parameters);

}
public static void  printer(String[] parm) {
  String result = "";
  for (int i = 0; i < parm.length; i++) {
    if (i != parm.length - 1) {
      result += parm[i] +" , ";
    }
    else {
      result += parm[i] +" ,";
    }
    System.out.println(result);
  }

}
}
