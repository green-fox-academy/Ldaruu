import java.util.Arrays;

public class DoubleItems {
  public static void main(String[] args) {
    int myarray[] = {2, 3, 4, 5, 6, 8};
    System.out.println(Arrays.toString(myarray));
    doublenum(myarray);
    System.out.println(Arrays.toString(myarray));
  }
   static void doublenum(int[] myarray) {
    for (int i = 0; i < myarray.length; i++) {
      myarray[i] *= 2;
    }
  }
}
