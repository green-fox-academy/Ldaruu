public class TrickyAv {
  public static void main(String[] args) {
    /**
     * Create and test a function called `getTrickyAvg` that takes a number array (only integers) as parameter
     * and returns the average of the smallest odd and largest even.
     *  - use only basic control flow statements, like 'for', 'if', etc.
     *  - do not use built-in methods like 'filter', 'forEach', 'map', etc.
     *  - write test for 2 different scenarios (test file is provided: TrickyAverageTest.java)
     *
     * Example cases:
     * [1, 2, 3] -> should return 1.5
     * [3, 4, 5, 6] -> should return 4.5
     * [5, 2, 8, -1] -> should return 3.5
     */
    int [] myarray = {3,4,5,6};
    System.out.println(tricky(myarray));

  }

  public static double tricky(int[] myarray) {
    double even = myarray[0];
    double odd = myarray[0];
    for (int i = 1; i < myarray.length; i++) {
      if (myarray[i] > even && myarray[i] % 2 == 0) {
        even = myarray[i];
      }
      for (int j = 1; j < myarray.length; j++) {
        if (myarray[j] < odd && myarray[j] % 2 != 0) {
          odd = myarray[j];
        }
      }
    }
    return (even + odd) / 2;
  }
}