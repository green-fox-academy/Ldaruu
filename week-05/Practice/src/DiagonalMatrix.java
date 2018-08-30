public class DiagonalMatrix {
  public static void main(String[] args) {
    int matrix [][] = new int[4][4];
    for (int row=0;row<5;row++){
      for (int col=0;col<5;col++){
        if (row == col){
          System.out.print("1");
        }else {
          System.out.print("0");
        }
      }
      System.out.println();
    }
  }
}
