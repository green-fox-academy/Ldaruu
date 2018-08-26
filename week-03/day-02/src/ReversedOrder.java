import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
  public static void main(String[] args) {
    Path path = Paths.get("reversed-order.txt");
    reversOrder(path);

  }

  public static void reversOrder(Path path) {
    Path path1 = Paths.get("reversedOrder.txt");
    List<String> order = new ArrayList<>();
    try {
      List<String> toReverse = Files.readAllLines(path);
      for (int lines = toReverse.size() - 1; lines >= 0; lines--) {
        order.add(toReverse.get(lines));
      }
      Files.write(path1, order);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

