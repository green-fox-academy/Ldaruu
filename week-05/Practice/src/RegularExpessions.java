import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpessions {
  public static void main(String[] args) {
    String message = "Mon Feb  5 10:47:12 2018   32.28.73.45   POST /";

    Pattern pattern = Pattern.compile("\\d{2}\\.\\d{2}\\.\\d{2}\\.\\d{2}");
    Matcher matcher = pattern.matcher(message);

    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
