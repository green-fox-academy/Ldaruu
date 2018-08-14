import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  public static void main(String[] args) {
    String word = "Second Line in the File";
    int numb = 10;
    String myFile = "my_file.txt";

    write(myFile, word, numb);
  }

  public static void write(String myFile, String word, int numb) {
    List<String> lines = new ArrayList();
    for (int i = 0; i < numb; i++) {
      lines.add(word);
    }
    try {
      Path path = Paths.get(myFile);
      Files.write(path, lines);
    } catch (IOException e) {

    }

  }
  // Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.
}
