import java.util.Arrays;

public class ReversArray {
  public static void main(String[] args) {
    int reverse[] = {1, 2, 3, 4, 5};
    int temp[] = {1, 2, 3, 4, 5};

    for (int i = temp.length - 1; i >= 0; i--) {
      reverse[i] = temp[temp.length - 1 - i];
    }
    System.out.println(Arrays.toString(reverse));
  }
}
