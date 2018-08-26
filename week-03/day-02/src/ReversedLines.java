import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  public static void main(String[] args) {
    Path path = Paths.get("reserved-lines.txt");
    Path path1 = Paths.get("reversed.txt");
    List<String> fixed = new ArrayList<>();
    try {
      List<String> lines = Files.readAllLines(path);
      for (String oneLine : lines) {
        fixed.add(reverse(oneLine));
      }
      Files.write(path1, fixed);
    } catch (IOException e) {
      e.printStackTrace();

    }
  }

  public static String reverse(String toreverse) {
    String rev = "";
    for (int index = toreverse.length() - 1; index >= 0; index--) {
      rev += toreverse.charAt(index);
    }

    return rev;

  }
}
