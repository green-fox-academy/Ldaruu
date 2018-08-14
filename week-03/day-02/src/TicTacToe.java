import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class TicTacToe {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.
    String filename = "win-o.txt";
    System.out.println(ticTacResult(filename));
  }

  public static String ticTacResult(String filename) {
    Path path = Paths.get(filename);
    try {
      ArrayList<String> lines = Files.readAllLines(path);
      String row = "";
      String column = "";
      String diagonal = "";
      String otherdiagonal = "";
      for (int i = 0; i < 3; i++) {
        for (int k = 0; k < 3; k++) {
          row += lines.get(i).charAt(k);
          column += lines.get(k).charAt(i);
          if (row.equals("XXX") || column.equals("XXX")) {
            return "X";
            if (row.equals("OOO") || column.equals("OOO")) {
              return "O";
            }
          }
        }
      }


      System.out.println(ticTacResult("win-o.txt"))
      // should print O

      System.out.println(ticTacResult("win-x.txt"))
      // should print X

      System.out.println(ticTacResult("draw.txt"))
      // should print draw
    }
  }
}