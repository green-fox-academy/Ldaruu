import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    String source = "my-file.txt";
    String output = "my-file2.txt";
    System.out.println(copy(source, output));
  }

  public static boolean copy(String source, String output) {
    Path path = Paths.get(source);
    Path path1 = Paths.get(output);
    try {
      Files.copy(path, path1);
      return true;
    } catch (IOException e) {
      return false;
    }
  }
}
// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful