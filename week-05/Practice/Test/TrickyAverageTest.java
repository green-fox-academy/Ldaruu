import org.junit.Assert;
import org.junit.Test;

public class TrickyAverageTest {
  /**
   * Write your test cases here. You should be able to invoke the method like this:
   * double result = TrickyAverage.getTrickyAvg(input);
   */

  @Test
  public void getTrickyAvg_testCase1() {
    int[] testOne = {1, 2, 3};
    Assert.assertEquals((double) (1 + 2) / 2, TrickyAverage.getTrickyAvg(testOne), 0.001);
    /*
     * create a test case
     */
  }

  @Test
  public void getTrickyAvg_testCase2() {
    int[] test2 = {2, 3, 5, 6, 9, 12};
    Assert.assertEquals((double) (3 + 12) / 2, TrickyAverage.getTrickyAvg(test2),0.001);
    /*
     * create a test case
     */
  }

}
