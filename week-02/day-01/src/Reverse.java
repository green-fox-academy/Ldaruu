import java.util.Arrays;

public class Reverse {
  public static void main(String[] args) {
    int [] aj = {3, 4, 5, 6, 7};
    int [] ajtemp = {3, 4, 5, 6, 7};
    for (int i = ajtemp.length -1 ; i >= 0; i-- ) {

      aj[i] = ajtemp[ajtemp.length - i - 1];

    }
    System.out.println(Arrays.toString(aj));
  }

// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`
}
