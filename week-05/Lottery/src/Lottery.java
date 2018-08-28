import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lottery {
  public static void main(String[] args) {
    System.out.println(topFive("doc/lottery.txt"));


  }

  public static List<String> readLottery(String filename) {
    List<String> readLines = new ArrayList<>();
    try {
      Path path = Paths.get(filename);
      readLines = Files.readAllLines(path);

    } catch (Exception e) {
      System.out.println("There was a problem with reading the file because: " + e);
    }
    return readLines;
  }

  public static List<String> getNumbers(String filename) {
    List<String> readLines = readLottery(filename);
    List<String> lotteryNumb = new ArrayList<>();
    for (String line : readLines) {
      String[] splittedLine = line.split("Ft;");
      String lastFiveNumb = splittedLine[splittedLine.length - 1];
      String[] lastFiveSplit = lastFiveNumb.split(";");
      for (String numb : lastFiveSplit) {
        lotteryNumb.add(numb);
      }
    }
    return lotteryNumb;
  }

  public static HashMap<String, Integer> countNumbs(List<String> lotteryNumb) {
    HashMap<String, Integer> numbCount = new HashMap<>();
    for (String num : lotteryNumb) {
      if (!numbCount.containsKey(num)) {
        numbCount.put(num, 1);
      } else {
        numbCount.put(num, numbCount.get(num) + 1);
      }
    }
    return numbCount;
  }

  public static List<String> topFivenum(HashMap<String, Integer> countNumbs) {
    List<String> bestFiveNum = new ArrayList<>();
    while (bestFiveNum.size() < 5) {
      int temp = 0;
      String key = "";
      for (String num : countNumbs.keySet()) {
        if (countNumbs.get(num) > temp) {
          key = num;
          temp = countNumbs.get(num);
        }
      }
      bestFiveNum.add(key);
      countNumbs.remove(key);
    }
    return bestFiveNum;

  }

  public static List<String> topFive(String filename) {

    List<String> numbers = getNumbers(filename);
    HashMap<String, Integer> countedNumbers = countNumbs(numbers);
    List<String> bestFive = topFivenum(countedNumbers);

    return bestFive;
  }
}