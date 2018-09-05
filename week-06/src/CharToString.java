import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CharToString {
  public static void main(String[] args) {

//    Write a Stream Expression to convert a char array to a string!
    char[] mychar = {'p', 'a', 'n', 'd', 'a'};

    String myS = new String(mychar);

    Stream<Character> cString = IntStream.range(0, mychar.length).mapToObj(c -> mychar[c]);
    String myS2 = cString
        .map(Object::toString)
        .collect(Collectors.joining(""));

    System.out.println(myS);
    System.out.println(myS2);
  }
}
