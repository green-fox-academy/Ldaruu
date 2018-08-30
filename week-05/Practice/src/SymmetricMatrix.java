import java.util.ArrayList;
import java.util.Arrays;

public class SymmetricMatrix {
  public static void main(String[] args) {


    ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
    matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1)));
    matrix.add(new ArrayList<Integer>(Arrays.asList(0, 2, 2)));
    matrix.add(new ArrayList<Integer>(Arrays.asList(1, 2, 5)));

    System.out.println(isSymmetric(matrix));
  }

  public static boolean isSymmetric(ArrayList<ArrayList<Integer>> matrix) {
    for (int i = 0; i < matrix.size(); i++) {
      if (matrix.size() != matrix.get(i).size()) {
        return false;
      }
      for (int j = 0; j < matrix.size(); j++) {
        if (matrix.get(i).get(j) != matrix.get(j).get(i)) {
          return false;
        }
      }
    }
    return true;
  }
}