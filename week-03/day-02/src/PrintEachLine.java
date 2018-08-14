import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
  public static void main(String[]args){
    // Write a program that opens a file called "my-file.txt", then prints
    // each of the lines form the file.
    // If the program is unable to read the file (for example it does not exists),
    // then it should print an error message like: "Unable to read file: my-file.txt"
    Path path = Paths.get("my-files.txt");
    try {
      for (String lines:Files.readAllLines(path)) {
        System.out.println(lines);
      }

    } catch (IOException e) {
      System.out.println("File can not be reached");
    }
  }
}
