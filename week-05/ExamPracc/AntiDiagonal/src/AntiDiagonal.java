public class AntiDiagonal {
  public static void main(String[] args) {
    /**
     * Create and test a method called `getAntiDiagonalAvg` that takes a multidimensional array (only integers)
     * which represents a square matrix, as a parameter and returns the average of the numbers in the anti diagonal.
     *  - write test for 2 different scenarios
     *
     * Example cases:
     * [
     *   [1, 2, 3],
     *   [3, 4, 6],
     *   [5, 2, 5]
     * ]
     * Should return 4, because (3 + 4 + 5) / 3 = 4.
     *
     * [
     *   [3, 5, 11, -2],
     *   [3, 1, 7, 4],
     *   [5, 0, 2, 9],
     *   [21, 7, 8, 2]
     * ]
     * Should return 6.5, because (-2 + 7 + 0 + 21) / 4 = 6.5.
     */
    int[][] matrix1 = {{1, 2, 3}, {3, 4, 6}, {5, 2, 5}};
    int[][] matrix2 = {{1, 2, 3}, {2, 3}, {1, 2, 3, 4}};
    System.out.println(getAntiDiagonalAvg(matrix1));
    System.out.println(getAntiDiagonalAvg(matrix2));

  }

  public static int getAntiDiagonalAvg(int[][] matrix) {
    int size = matrix.length;
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (matrix[i].length != matrix[j].length) {
          System.out.println("Matrix is not a square!");
          return 0;
        } else if (i == size - 1 - j) {
          sum += matrix[i][j];
        }
      }
    }
    return sum / size;
  }
}
