public class SumAll {
  public static void main(String[] args) {
    int sumAll[] = {3, 5, 8, 2};
    int sum = 0;
    for (int i = 0; i < sumAll.length; i++) {
      sum += sumAll[i];
    }
    System.out.println(sum);
  }
}
