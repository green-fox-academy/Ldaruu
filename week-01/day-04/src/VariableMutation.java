public class VariableMutation {
  public static void main(String[] args) {
    int a = 3;
    // make it bigger by 10


    System.out.println(a + 10);


    int b = 100;
    // make it smaller by 7


    System.out.println(b - 7);


    int c = 44;
    // please double c's value


    System.out.println(c * 2);


    int d = 125;
    // please divide by 5 d's value


    System.out.println(d / 5);


    int e = 8;
    // please cube of e's value


    System.out.println(e * e);


    int f1 = 123;
    int f2 = 345;
    // tell if f1 is bigger than f2 (print as a boolean)
    if (f1 > f2) {
      System.out.println(true);
    } else {
      System.out.println(false + " :f1 is not bigger than f2.");
    }


    int g1 = 350;
    int g2 = 200;
    // tell if the double of g2 is bigger than g1 (print as a boolean)
    if (g2 * 2 > g1) {
      System.out.println(true + ":Yes double of g2 is bigger than g1");
    } else {
      System.out.println(false + " :Double of g2 is not bigger than g1");
    }


    int h = 135798745;
    // tell if it has 11 as a divisor (print as a boolean)
    boolean isDivisibleBy11 = h % 11 == 0;
    System.out.println(isDivisibleBy11);




    int i1 = 10;
    int i2 = 3;
    // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
    boolean i1IsHigher = ((i1 > (i2 * i2 * i2)) &&  (i1 < i2 * i2));
    System.out.println(i1IsHigher);

    int j = 1521;
    // tell if j is dividable by 3 or 5 (print as a boolean)
    boolean dividable = (j % 3 == 0) || (j % 5 == 0);
    System.out.println(dividable);


    String k = "Apple";
    //fill the k variable with its cotnent 4 times
    for (int i = 0; i < 4; i+= 1 )
    System.out.print(k);



  }

}