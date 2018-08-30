import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // The program’s aim is to collect your favourite animals and store them in a text file.
    // There is a given text file called ‘’'favourites.txt’’', it will contain the animals
    // If ran from the command line without arguments
    // It should print out the usage:
    //
//    ```java FavouriteAnimals [animal] [animal]```
    // You can add as many command line arguments as many favourite you have.
    // One animal should be stored only at once
    // Each animal should be written in separate lines
    // The program should only save animals, no need to print them

    Path myPath = Paths.get("doc/favourite.txt");
    ArrayList<String> toWrite = new ArrayList<>();
    for (int i = 0; i < args.length; i++) {
      if (args.length == 0) {
        System.out.println(" ```java FavouriteAnimals [animal] [animal]```");
      } else {
        toWrite.add(args[i]);
      }
      System.out.println();
    }
    try {
      Files.write(myPath, toWrite);
    } catch (IOException e) {
      System.out.println("there has been a problem " + e);
    }
    if (args.length == 0) {
      System.out.println(" ```java FavouriteAnimals [animal] [animal]```");
    }
  }
}
