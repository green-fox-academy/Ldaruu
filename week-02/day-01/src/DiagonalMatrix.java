public class DiagonalMatrix {
  public static void main(String[] args) {
    int [] [] matrix = new int[4][4];
    for (int i = 0; i < matrix.length;i++ ) {
      for (int b = 0; b < matrix.length; b++) {
        if (i == b) {
          System.out.print("1");
        }
        else {
          System.out.print("0");
        }

      }
      System.out.println();
    }
  }

  // - Create (dynamically) a two dimensional array
  //   with the following matrix. Use a loop!
  //
  //   1 0 0 0
  //   0 1 0 0
  //   0 0 1 0
  //   0 0 0 1
  //
  // - Print this two dimensional array to the output
}
