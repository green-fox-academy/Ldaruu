public class ChessTanble {
  public static void main(String[] args) {
    for (int o = 0; o < 4; o++) {
      for (int p = 0; p < 1; p++) {
        for (int q = 0; q < 4; q++) {
          for (int r = 0; r < 1; r++) {
            System.out.print("%"+" ");
          }
        }
        System.out.println();
      }

      for (int i = 0; i < 1; i++) {
        for (int k = 0; k < 4; k++) {
          for (int j = 0; j < 1; j++) {
            System.out.print(" "+ "%");
          }
        }
        System.out.println();
      }
    }
  }
}
