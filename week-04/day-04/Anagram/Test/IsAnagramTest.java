import org.junit.Assert;
import org.junit.Test;

public class IsAnagramTest {



  @Test
  public void areTheesewordsAnagramms(){
    Assert.assertTrue(Anagram.isAnagram("apple", "elppa"));
  }
  @Test
  public void notAnagramms(){
    Assert.assertFalse(Anagram.isAnagram("apple","pear"));
  }
  @Test
  public void testWithOneWord(){
    Assert.assertFalse(Anagram.isAnagram("","apple"));
  }
  @Test
  public void testWithNoWorls(){
    Assert.assertTrue(Anagram.isAnagram("",""));
  }
  @Test(expected = NullPointerException.class)
  public void testWithNull(){
    Assert.assertFalse(Anagram.isAnagram(null,null));
  }

}
