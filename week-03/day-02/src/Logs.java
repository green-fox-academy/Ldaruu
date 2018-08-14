import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Logs {
  public static void main(String[] args){
    // Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
    ArrayList<String> List =new ArrayList<>();
    Path path = Paths.get("log.txt");
    try {
       List :Files.readAllLines(path) ;
      }catch(IOException e) {
      System.out.println("Can not read the file!");
    }


  }
}
