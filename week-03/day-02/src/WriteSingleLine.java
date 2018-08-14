import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    List<String>line =new ArrayList();
    line.add("First line in my File");
    try {
      Path path = Paths.get("my-file.txt");
      Files.write(path,line);
    }catch (IOException e){
      System.out.println("Can not write into the file");
    }
    // Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
    // then it should print an error message like: "Unable to write file: my-file.txt"
  }
}