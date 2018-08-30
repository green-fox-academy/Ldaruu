import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Poem {
  public static void main(String[] args) {
    System.out.println(countFiveLenghtWord("doc/poem.txt"));
    System.out.println(countFiveLettersWithRegExpress("doc/poem.txt"));
    System.out.println(listWordsWithAddedLenght("doc/poem.txt", 5));
    System.out.println(listWordsWithAddedLenght("doc/poem.txt", 3));
  }

  public static List<String> readAllLines(String filename) {
    List<String> allLines = new ArrayList<>();
    try {
      Path path = Paths.get(filename);
      allLines = Files.readAllLines(path);
    } catch (Exception e) {
      System.out.println("Cannot read the file, exception: " + e);
    }
    return allLines;
  }

  public static List<String> countFiveLenghtWord(String filename) {
    List<String> allLines = readAllLines(filename);
    List<String> words = new ArrayList<>();
    int sum = 0;
    for (String oneLine : allLines) {
      String modified;
      modified = oneLine.replace(",", "");
      modified = modified.replace("?", "");
      modified = modified.replace(";", "");
      modified = modified.replace(".", "");
      String[] splittedOneLine = modified.split(" ");
      for (String oneWord : splittedOneLine) {
        if (oneWord.length() == 5) {
          sum++;
          words.add(oneWord);
        }
      }
    }
    return words;
  }

  public static int countFiveLettersWithRegExpress(String filename) {
    List<String> allLines = readAllLines(filename);
    Pattern pattern = Pattern.compile("\\b[a-zA-Z]{5}\\b");
    int sum = 0;
    for (String line : allLines) {
      Matcher matcher = pattern.matcher(line);
      while (matcher.find()) {
        sum += 1;
      }
    }
    return sum;
  }

  public static List<String> listWordsWithAddedLenght(String filename, int lenght) {
    List<String> allLines = readAllLines(filename);
    List<String> words = new ArrayList<>();
    int sum = 0;
    for (String oneLine : allLines) {
      String modified;
      modified = oneLine.replace(",", "");
      modified = modified.replace("?", "");
      modified = modified.replace(";", "");
      modified = modified.replace(".", "");
      String[] splittedOneLine = modified.split(" ");
      for (String oneWord : splittedOneLine) {
        if (oneWord.length() == lenght) {
          sum++;
          words.add(oneWord);
        }
      }
    }
    return words;
  }
}
