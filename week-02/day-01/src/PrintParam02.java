public class PrintParam02 {
  public static void main(String[] args) {

    printParms( "first", "Second", "Third");
  }

  public static void printParms(String ... stringParms) {
    System.out.println("Number of arguments: "+stringParms.length);
    for (int i = 0; i < stringParms.length; i++) {
      System.out.print(stringParms[i] + " ");
    }
  }
}
