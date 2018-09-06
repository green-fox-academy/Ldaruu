import java.util.Random;

public class Reservation implements Reservations {
//  Create a Reservation class by implementing all the features as required by the interface.
//  The booked reservations should look like the output below.
//  Please note that the reservation code should contain 8 characters randomly from 0-Z, all uppercase letters.
//  String.format acts similarly as System.out.printf(); in the previous exercise, however the string will not be automatically printed.
//      Also, the DOW is randomly ordered to the bookings from an array.
//  DOW stands for Day of the Week (MON, TUE, etc.)


  private static String[] DOW_ARRAY = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
  private static char[] CHAR_ARRAY = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
      'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
      'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
  private static int CODE_LENGHT = 8;

  private String dow;
  private String code;

  public Reservation() {
    this.dow = getDowBooking();
    this.code = getCodeBooking();
  }

  @Override
  public String getDowBooking() {
    Random random = new Random();
    return DOW_ARRAY[random.nextInt(7)];
  }

  @Override
  public String getCodeBooking() {
    Random random = new Random();
    String iD = "";
    for (int i = 0; i < CODE_LENGHT; i++) {
      iD += CHAR_ARRAY[random.nextInt(CHAR_ARRAY.length)];
    }
    return iD;
  }
  public void printBooking(){
    System.out.printf("Booking#\t%s for\t%s\n",this.dow,this.code);
  }
}
