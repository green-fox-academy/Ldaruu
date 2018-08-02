public class CodingHours {
  public static void main(String[] args) {
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    //
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52
    double codingHours = 6;
    double day = 5;
    double week = 17;
    double workhours =  52;
    System.out.println("An attendee codes: " + codingHours * day * week + " hours in a semester.");
    System.out.println((codingHours * week * day) / (workhours * week) * 100 + "%");
  }
}



