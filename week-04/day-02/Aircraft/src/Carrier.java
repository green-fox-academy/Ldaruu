import java.util.ArrayList;
import java.util.List;

public class Carrier {
  private int ammoStorage;
  private int HP;

  private List<Aircrafts> aircraftsList;

  public Carrier(int ammo, int HP) {
    aircraftsList = new ArrayList<>();
    this.ammoStorage =ammo;
    this.HP = HP;
  }

  public void addAircraft(Aircrafts aircrafts) {
    aircraftsList.add(aircrafts);
  }

  public void fill() {
    if (ammoStorage ==0 ){
      System.out.println("We are out of Ammo!");
    }else {
      for (Aircrafts currentflight :aircraftsList) {
        if (currentflight.getAmmo()< currentflight.getMaxammo() ) {
          currentflight.refil(ammoStorage);
        }
      }
    }
  }
}
