public class Unique {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example
//    System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`
    int numbers[] = {1, 3, 1, 5, 1, 5, 6, 11, 8, 6, 8, 10};
    unique(numbers);
  }

  public static void unique(int uniquenum[]) {
    for (int i= 0; i< uniquenum.length; i++) {
      boolean isunique = false;

      for (int k = 0; k < i; k ++){
        if (uniquenum[i] ==uniquenum[k]) {
          isunique = true;
          break;
        }
      }
      if (!isunique){
        System.out.print(uniquenum[i] + "; ");
      }
    }
  }
}