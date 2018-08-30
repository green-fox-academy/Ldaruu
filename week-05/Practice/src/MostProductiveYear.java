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
    String ghibli = "ghibli";
    System.out.println(mostProductiveYear(marvel));
    System.out.println(mostProductiveYear(paramount));
    System.out.println(mostProductiveYear(ghibli));
  }

  private static String mostProductiveYear(String studioName) {
    String mostProductive = "";
    List<String> lines = new ArrayList<>();
    Map<String, Integer> yearCounter = new HashMap<>();
    String bestYear = "";
    if (studioName.equals("marvel") || studioName.equals("paramount")) {
      try {
        Path filePath = Paths.get("doc/" + studioName + ".txt");
        lines = Files.readAllLines(filePath);
      } catch (Exception e) {
        System.out.println("Something went wrong");
      }
      for (int i = 0; i < lines.size(); i++) {
        String yearToCheck = lines.get(i).split(",")[1];
        if (!yearCounter.containsKey(yearToCheck)) {
          yearCounter.put(yearToCheck, 1);
        } else {
          Integer temp = yearCounter.get(yearToCheck);
          yearCounter.put(yearToCheck, temp + 1);
        }
      }
      int value = 0;
      for (String key : yearCounter.keySet()) {
        if (yearCounter.get(key) > value) {
          bestYear = key;
          value = yearCounter.get(key);
        }
      }
      mostProductive = studioName + " has made the most movies in " + bestYear;
      mostProductive = mostProductive.concat(bestYear);
    } else {
      mostProductive = "Cannot find studio, please try again later.";
    }
    return mostProductive;
  }
}

