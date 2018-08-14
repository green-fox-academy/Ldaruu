import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLines {
  public static void main(String[] args) {
    String myFile = "my_file.txt";
    counter(myFile);
  }
    static int counter(String myFile){
    int counter = 0;
    Path path =Paths.get(myFile);
    try {
      for (String currentLine : Files.readAllLines(path)) {
        counter++;
      }
    } catch (IOException e) {
      return 0;
    }
    return counter;
  }
}

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

