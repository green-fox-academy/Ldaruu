public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch
    Thing milk = new Thing("Milk");
    fleet.add(milk);
    Thing remove = new Thing("Remove the obstacles");
    fleet.add(remove);
    Thing standup = new Thing("Stand up");
    fleet.add(standup);
    Thing eat = new Thing("Eat lunch");
    fleet.add(eat);
    standup.complete();
    eat.complete();


    System.out.println(fleet);
  }
}