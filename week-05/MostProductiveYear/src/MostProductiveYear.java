import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostProductiveYear {
  public static void main(String[] args) {
    String marvel = "marvel";
    String paramount = "paramount";
    String andy = "Vajna";

    System.out.println(mostProductive(paramount));
    System.out.println(mostProductive(marvel));
    System.out.println(mostProductive(andy));

  }

  public static String mostProductive(String studioName) {
    String mostProductive = "";
    List<String> lines = new ArrayList<>();
    Map<String, Integer> yearCounter = new HashMap<>();
    String bestYear = "";
    if (studioName.equals("paramount") || studioName.equals("marvel")) {
      try {
        Path path = Paths.get("doc/" + studioName + ".txt");
        lines = Files.readAllLines(path, StandardCharsets.UTF_8);
      } catch (IOException e) {
        System.out.println("Something went wrong we were not able to read the file!");
      }
//      System.out.println(lines.size());
      for (int i = 0; i < lines.size(); i++) {
        String yearToCheck = lines.get(i).split(",")[1];
        if (!yearCounter.containsKey(yearToCheck)) {
          yearCounter.put(yearToCheck, 1);
        } else {
          Integer sameYear = yearCounter.get(yearToCheck);
          yearCounter.put(yearToCheck, sameYear + 1);
        }
      }
      int value = 0;
      for (String years : yearCounter.keySet()) {
        if (yearCounter.get(years) > value) {
          bestYear = years;
          value = yearCounter.get(years);
        }
      }
      mostProductive = studioName + " made a lot of  movies in " + bestYear;
    } else {
      mostProductive = "I am sorry we have no information about this studio!";
    }
    return mostProductive;
  }
}
/**
 * Write a method that helps you find the most productive year for a film studio.
 * The method should take one argument, which is the name of the film studio.
 * The method should try to open the related data file named `studioname`.csv,
 * which is a comma separated file with 3 columns: name of the movie, release year, director
 * <p>
 * - If we do not have any data about the studio, the method should return an error message.
 * - If we have found data, the method should return an information message about the most productive year for that studio.
 * <p>
 * Examples:
 * <p>
 * If we call the method with 'marvel':
 * should return 'marvel has made the most movies in 2017.'
 * <p>
 * If we call the method with 'ghibli':
 * should print 'Cannot find studio, please try again later.'
 * <p>
 * Hint:
 * - You can find some example files in this folder (marvel.csv and paramount.csv)
 * - Most productive year: The year in which the studio has made the most movies.
 */
