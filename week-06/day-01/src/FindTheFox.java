import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

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

    List<String> foxes = myfox.stream()
        .filter(fox -> fox.getColor().equals("green") && fox.getType().equals("pallida"))
        .map(Objects::toString)
        .collect(Collectors.toList());

    System.out.println(foxes);

    List<Fox> fox = myfox;
    System.out.println(fox .stream().collect(Collectors.partitioningBy((Fox f) -> f.getType().equals("pallida")
        && f.getColor().equals("green"))));
  }

}


