import java.util.ArrayList;
import java.util.HashMap;
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

  public void add(Book book) {
    bookShelf.add(book);
  }

  public void remove(String title) {
    for (int i = 0; i < bookShelf.size(); i++) {
      if (bookShelf.get(i).title == title) {
        bookShelf.remove(bookShelf.get(i));
      }
    }
  }

  public String favouriteAuth() {
    HashMap<String, Integer> authors = new HashMap<>();
    String favourite = "";
    if (bookShelf.size() == 0) {
      return "This bookshelf is empty!";
    } else {
      for (int i = 0; i < bookShelf.size(); i++) {
        if (!authors.containsKey(bookShelf.get(i).author)) {
          authors.put(bookShelf.get(i).author, 1);
        } else {
          authors.put(bookShelf.get(i).author, +1);
        }
      }
      int bestauthorcounter = 0;
      for (String bestAuthor : authors.keySet()) {
        if (bestauthorcounter < authors.get(bestAuthor)) {
          favourite = bestAuthor;
          bestauthorcounter = authors.get(bestAuthor);
        }
      }
    }
    return favourite;
  }

  public String earliestRealise() {
    if (bookShelf.size() == 0) {
      return "Bookshelf is empty!";
    } else {
      int erliestRe = bookShelf.get(0).releaseYear;
      for (int i = 0; i < bookShelf.size(); i++) {
        if (bookShelf.get(i).releaseYear < erliestRe) {
          erliestRe = bookShelf.get(i).releaseYear;
        }
      }
      String earliestPublis = "Earliest released: ";
      for (int i = 0; i < bookShelf.size(); i++) {
        if (bookShelf.get(i).releaseYear == erliestRe) {
          earliestPublis += bookShelf.get(i).toString();
        }
      }
      return earliestPublis;
    }
  }

  public String latestRealise() {
    if (bookShelf.size() == 0) {
      return "Bookshelf is empty";
    } else {
      int latestRe = bookShelf.get(0).releaseYear;
      for (int i = 0; i < bookShelf.size(); i++) {
        if (bookShelf.get(i).releaseYear > latestRe) {
          latestRe = bookShelf.get(i).releaseYear;
        }
      }
      String latestPublis = "Latest released; ";
      for (int i = 0; i < bookShelf.size(); i++) {
        if (bookShelf.get(i).releaseYear == latestRe) {
          latestPublis += bookShelf.get(i).toString();
        }
      }
      return latestPublis;
    }
  }

  public String toString() {
    return "You have: " + bookShelf.size() + " books\n" + earliestRealise() + "\n" + latestRealise() + "\nFavourite author: " + favouriteAuth();
  }
}
