import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
  // Create a Bookshelf class that has a list of books in it
  // We should be able to add and remove books
  // We should be able to query the favourite author (who has written the most books in the shelf)
  // We should be able to query the earliest published books.
  // We should be able to query the latest published books.
  // Bookshelf should have a toString() method which give us information about the number of books,
  // the earliest and the latest released books, and the favourite author
  List<Book> bookShelf = new ArrayList<>();

  public Bookshelf() {
  }

  public void add (Book book) {
    bookShelf.add(book);
  }

  public void remove(String title) {
    for (int i = 0; i < bookShelf.size(); i++) {
      if (bookShelf.get(i).equals(title)) {
        bookShelf.remove(bookShelf.get(i));
      }
    }
  }

}
