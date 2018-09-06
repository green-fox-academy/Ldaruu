public class Reservation implements Reservations {

  private static String[] DOW_ARRAY = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
  private static char[] CHAR_ARRAY = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
      'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
      'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
  private static int CODE_LENGHT = 8;

  @Override
  public String getDowBooking() {
    return null;
  }

  @Override
  public String getCodeBooking() {
    return null;
  }
}
