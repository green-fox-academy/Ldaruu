import java.util.ArrayList;
import java.util.List;

public class FindTheFox {
  public static void main(String[] args) {
    List<Fox> myfox = new ArrayList<>();
    Fox joe = new Fox("Joe", "red", "red");
    Fox bob = new Fox("Bob", "pallida", "green");
    Fox toby = new Fox("Toby", "alopex", "white");
    Fox max = new Fox("Max", "pallida", "green");
    Fox mike = new Fox("Mike", "killerfox", "brown");
    myfox.add(joe);
    myfox.add(bob);
    myfox.add(toby);
    myfox.add(mike);
    myfox.add(max);
  }

}


