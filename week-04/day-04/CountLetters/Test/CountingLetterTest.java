import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class CountingLetterTest {

  String myString;

  @Test
  public void countLettersTest() {
    myString = "baba";
    HashMap myHas = new HashMap<Integer, String>();
    myHas.put("a", 2);
    myHas.put("b", 2);
    Assert.assertEquals(myHas, CountLetters.countLetters(myString));
  }
}