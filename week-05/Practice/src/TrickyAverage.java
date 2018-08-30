public class TrickyAverage {
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

    int myarray[] = {3, 4, 5, 6};
    int myarray2[] = {5, 2, 8, -1};
    int myarray3[] = {1};
    System.out.println(getTrickyAvg(myarray2));
    System.out.println(getTrickyAvg(myarray));
    System.out.println(getTrickyAvg(myarray3));

  }

  public static double getTrickyAvg(int[] myarray) {
    double smallestOdd = 0;
    double largestEven = 0;
    for (int i = 0; i < myarray.length; i++) {
      if (myarray[i] % 2 != 0) {
        smallestOdd = myarray[i];
      } else if (myarray[i] % 2 == 0) {
        largestEven = myarray[i];
      }
    }
    for (int i = 0; i < myarray.length; i++) {
      if (myarray[i] % 2 == 0 && myarray[i] > largestEven) {
        largestEven = myarray[i];
      } else if (myarray[i] % 2 != 0 && myarray[i] < smallestOdd) {
        smallestOdd = myarray[i];
      }
    }
    return (largestEven + smallestOdd) / 2;
  }
}