import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumTest {

  Sum addnum = new Sum();
  ArrayList<Integer> numbs;

  @Test
  public void addNumTogether() {
    ArrayList<Integer> numbs = new ArrayList<>(Arrays.asList(2, 3, 10, 20));
    Assert.assertEquals(35, addnum.sum(numbs));
  }

  @Test
  public void ifListisEmpty() {
    ArrayList<Integer> numbs = new ArrayList<>();
    Assert.assertEquals(0, addnum.sum(numbs));
  }

  @Test
  public void listWithOneElement() {
    ArrayList<Integer> numbs = new ArrayList<>(Arrays.asList(2));
    Assert.assertEquals(2, addnum.sum(numbs));

  }

  @Test
  public void addZeroTogether() {
    ArrayList<Integer> numbs = new ArrayList<>(Arrays.asList(0));
    Assert.assertEquals(0, addnum.sum(numbs));
  }

  @Test (expected = NullPointerException.class)
  public void getSumWithNull() {
    numbs = null;
    Assert.assertEquals(null, addnum.sum(numbs));
  }
}

