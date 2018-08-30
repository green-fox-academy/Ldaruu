import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class UniqueChartTest {

  @Test
  public void UniqueCharTest1() {
    String test1 = "hello";
    List<String> myTest = UniqueChart.uniqueCharacters(test1);
    Assert.assertTrue(myTest.contains("e"));
    Assert.assertTrue(myTest.contains("o"));
  }
  @Test
  public void UniqueCharTestFail(){
    String test2 ="hello";
    List<String>mytest2=UniqueChart.uniqueCharacters(test2);
    Assert.assertFalse(mytest2.contains("l"));
  }
}
