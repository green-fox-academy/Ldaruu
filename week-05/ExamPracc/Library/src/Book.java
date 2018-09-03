public class Book {
  // Create a Book class, that has an author, a title and a release year
  // Create a constructor for setting those values
  // Book should have a toString() method that returns a string in this format:
  // Douglas Adams : The Hitchhiker's Guide to the Galaxy (1979)
  String author;
  String title;
  int releaseYear;

  public Book(String author, String title, int releaseYear) {
    this.author = author;
    this.title = title;
    this.releaseYear = releaseYear;
  }

  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public int getReleaseYear() {
    return releaseYear;
  }

  public String toString() {
    return getAuthor() + " : " + getTitle() + "\t(" + getReleaseYear() + ")";
  }
}
