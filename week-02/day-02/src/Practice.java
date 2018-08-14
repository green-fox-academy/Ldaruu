import java.util.*;

public class Practice {
  public static void main(String... args) {
  Scanner input = new Scanner(System.in);
    System.out.println("Pleasegive me a number:");
    int num = input.nextInt();
    System.out.println("Please give me"+ num+ "more numbers");
    int sum =0;
    double mynum [] = new double[num];
    for (int i = 0; i <num; i++) {
      int n = input.nextInt();
      mynum[i]+=n;
    }
    for (int j=0; j< mynum.length; j++){
      sum += mynum[j];
    }
    int av =sum/num;
    System.out.println("Sum: "+sum+ " Ave: "+av);
  }


}

