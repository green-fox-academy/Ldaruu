import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {
    Path path = Paths.get("duplicated-chars.txt");
    duplicated(path);
  }

  public static void duplicated(Path path) {
    Path decryp = Paths.get("decrypted-text.txt");
    List<String> newText = new ArrayList<>();
    try {
      List<String> lines = Files.readAllLines(path);
      for (int i = 0; i < lines.size(); i++) {
        String oneLine = "";
        for (int j = 0; j < lines.get(i).length(); j = j + 2) {
          oneLine += lines.get(i).charAt(j);
        }
        newText.add(oneLine);
        System.out.println(oneLine);
      }
      Files.write(decryp,newText);
    } catch (IOException e) {
    }
  }
}