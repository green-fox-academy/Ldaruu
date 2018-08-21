import java.util.ArrayList;
import java.util.List;

public class Carrier {
  private int ammoStorage;
  private int HP;
  private List<Aircrafts> aircraftsList;

  public Carrier(int ammo, int HP) {
    aircraftsList = new ArrayList<>();
    this.ammoStorage = ammo;
    this.HP = HP;
  }

  public void addAircraft(Aircrafts aircrafts) {
    aircraftsList.add(aircrafts);
  }
//  Re/Filling up the Aircraft ammo
  public void fill() {
    if (ammoStorage == 0) {
      System.out.println("We are out of Ammo!");
    } else {
      for (Aircrafts currentflight : aircraftsList) {
        if (currentflight.isPriority()) {
          this.ammoStorage = currentflight.refil(this.ammoStorage);
          if (this.ammoStorage == 0)
            break;
        }
      }
      for (Aircrafts currentflight1 : aircraftsList) {
        if (!currentflight1.isPriority()) {
          this.ammoStorage = currentflight1.refil(this.ammoStorage);
          if (this.ammoStorage == 0)
            break;
        }
      }
    }
  }
//   Calculating the full Damage of the Carrier
  int fullDamage() {
    int allDamage = 0;
    for (int i = 0; i < this.aircraftsList.size(); i++) {
      allDamage += this.aircraftsList.get(i).allDamage();
    }
    return allDamage;
  }

  void fight(Carrier otherCarrier) {

  }
//  Status of the Aircraft Carrier
  void getStatus() {
    if (HP == 0) {
      System.out.println("It's dead Jimbooo it's dead :(");
    } else {
      System.out.println("HP: " + this.HP + ", Aircraft count: " + this.aircraftsList.size() + ", Ammo Storage: " + this.ammoStorage
          + ", Total Damage: " + fullDamage() + "\nAircrafts:");
      for (int i = 0; i < aircraftsList.size(); i++) {
        aircraftsList.get(i).getStatus();
      }
      System.out.println();
    }
  }
}
