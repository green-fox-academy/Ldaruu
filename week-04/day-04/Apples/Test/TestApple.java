import org.junit.Assert;
import org.junit.Test;

public class TestApple {

  @Test
public void areWeGettingApple(){
    Apple a= new Apple();
    Assert.assertEquals("apple", a.getApple());
  }

}
