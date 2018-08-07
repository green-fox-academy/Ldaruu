public class TodoPrint {
  public static void main(String[] args) {
    String todoText = " - Buy milk";

    String addToFront = "My todo:";
    String addtoEnd = " - Download games";
    String addinGames = "- Diablo";
    String newLine = "\n";
    String addTab = "\t";

    todoText = addToFront.concat(newLine.concat(todoText.concat(newLine.concat
        (addtoEnd.concat(newLine.concat(addTab.concat(addinGames.concat(""))))))));

    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention

    // Expected outpt:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo

    System.out.println(todoText);
  }
}
