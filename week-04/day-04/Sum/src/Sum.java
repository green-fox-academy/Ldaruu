import java.util.ArrayList;
import java.util.List;

public class Sum {

  int sum = 0;

//  public void addToList(int a) {
//    numbs.add(a);
//  }

  public int sum(ArrayList<Integer> numbs) {
    for (int i = 0; i < numbs.size(); i++) {
      sum += numbs.get(i);
    }
    return sum;
  }
}
