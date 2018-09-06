import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Reservation> bookingList = reservations(10);
    for (Reservation current : bookingList) {
      current.printBooking();

    }

  }

  public static List<Reservation> reservations(int bookingNum) {
    List<Reservation> bookings = new ArrayList<>();
    for (int i = 0; i < bookingNum; i++) {
      bookings.add(new Reservation());
    }
    return bookings;
  }
}
