import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EndsWithS {
  public static void main(String[] args) {
    /**
     * Create a method called `endsWithS` that takes a filename as a string
     * and returns the number of the words, that ends with 's'.
     *
     * Example cases:
     *
     * the correct output for the 'base.txt' is: 26
     * hint: Keep in mind that there may punctuation marks at the end of the words
     */
    String filename = "doc/myfile.txt";
    System.out.println(endsWithS(filename));
    System.out.println(allEndsWithS(filename));
  }

  public static List<String> readAllLines(String filename) {
    List<String> allLines = new ArrayList<>();
    try {
      Path path = Paths.get(filename);
      allLines = Files.readAllLines(path);
    } catch (Exception e) {
      System.out.println("Uups something went wrong while reading the file" + e);
    }
    return allLines;
  }

  public static int endsWithS(String filename) {
    List<String> allLines = readAllLines(filename);
    Pattern pattern = Pattern.compile("\\b[A-Za-z]*s\\b"); // The \b matches the beginning and end of a word i.e. space,
    // tab or newline, or the beginning or end of a string. The [A-Za-z] will match any letter, and the * means that 0+ get matched.
    //Finally there is the s.

    int sum = 0;
    for (String line : allLines) {
      Matcher matcher = pattern.matcher(line);
      while (matcher.find()) {
        sum++;
      }
    }
    return sum;
  }

  public static List<String> allEndsWithS(String filename) {
    List<String> allLines = readAllLines(filename);
    List<String> wordswithS = new ArrayList<>();
    Pattern parameter = Pattern.compile("\\b[A-Za-z]*s\\b");

    for (String line : allLines) {
      Matcher matcher = parameter.matcher(line);
      while (matcher.find()) {
        wordswithS.add(matcher.group());
      }
    }
    return wordswithS;
  }
}
