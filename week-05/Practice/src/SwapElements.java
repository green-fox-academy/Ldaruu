import java.util.Arrays;

public class SwapElements {
  public static void main(String[] args) {
    String swap[]= {"apple", "car", "spaceship"};
    String temp= swap[0];
    swap[0]= swap[2];
    swap[2]=temp;
    System.out.println(Arrays.toString(swap));
  }
}
