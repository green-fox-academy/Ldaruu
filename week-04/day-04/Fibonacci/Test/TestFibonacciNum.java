import org.junit.Assert;
import org.junit.Test;

public class TestFibonacciNum {

  @Test
  public void isThisNumFibonacci() {
    Assert.assertEquals(13,Fibonacci.fibo(7));
  }
  @Test
  public void nullFibonacciIsNull(){
    Assert.assertEquals(0,Fibonacci.fibo(0));
  }
  @Test (expected = NullPointerException.class)
  public void negativeTestStackOverFlow(){
    Assert.assertEquals(-3,Fibonacci.fibo(-4));
  }
}