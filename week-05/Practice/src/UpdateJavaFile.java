import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class UpdateJavaFile {
  public static void main(String[] args) {
//     Create a function that takes a java source file path (e.g. "src.java") as an input,
// reads the given file, and remove the singe line comments from it. It should write the comment-free
// code to the original file
    String filename="src/AAA.java";
    System.out.println(updateFile(filename));

  }
  public static List<String> updateFile(String filename){
    Path path = Paths.get(filename);
    List<String>fixedLine =new ArrayList<>();
    try {
      List<String>lines = Files.readAllLines(path);
      for (String oneline:lines){
      fixedLine.add(oneline);
      }
      fixedLine.remove(2);
      Files.write(path,fixedLine);
    }catch (Exception e){
      System.out.println("Can not read the file!");
    }
    return fixedLine;

  }
}
