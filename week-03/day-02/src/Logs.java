import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    // Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
    Path path = Paths.get("log.txt");
    System.out.println(unigue(path));
    System.out.println(ratio(path));
  }

  public static ArrayList<String> unigue(Path path) {
    ArrayList<String> uniquelist = new ArrayList<>();
    try {
      List<String> inputList = Files.readAllLines(path);
      for (int i = 0; i < inputList.size(); i++) {
        String IPlist = inputList.get(i).split("   ")[1];
        if (!uniquelist.contains(IPlist)) {
          uniquelist.add(IPlist);
        }
      }
    } catch (IOException c) {
    }
    System.out.println(uniquelist.size());
    return uniquelist;
  }

  public static double ratio(Path path) {
    ArrayList<String> getlist = new ArrayList<>();
    ArrayList<String> postlist = new ArrayList<>();
    try {
      List<String> inputList = Files.readAllLines(path);
      for (int i = 0; i < inputList.size(); i++) {
        String IPlist = inputList.get(i).split("   ")[2];

        if (IPlist.equals("GET /")) {
          getlist.add(IPlist);
        } else if (IPlist.equals("POST /")) {
          postlist.add(IPlist);
        }
      }
    }catch (IOException c ){
    }
    double getPost = (double)getlist.size() /(double)postlist.size();
    return getPost;
  }
}