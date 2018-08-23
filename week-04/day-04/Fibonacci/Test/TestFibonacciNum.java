import org.junit.Assert;
import org.junit.Test;

public class TestFibonacciNum {

  @Test
  public void isThisNumFibonacci() {
    Fibonacci fibonacci = new Fibonacci();
    Assert.assertEquals(13,fibonacci.fibo(7));
  }
}