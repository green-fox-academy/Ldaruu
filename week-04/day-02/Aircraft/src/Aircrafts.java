public class Aircrafts {
  private int ammo;
  private int maxammo;
  private int baseDamage;
  private String type;
  private int damage;

  public Aircrafts() {
    ammo = 0;
  }

  public int fight() {
    damage = baseDamage * ammo;
    ammo = 0;
    return damage;
  }

  public int refil(int ammoAmount) {
    int remindAmmo = maxammo - ammo;
    if (maxammo - ammo < maxammo) {
      ammo += remindAmmo;
      System.out.println("Refilling the flight with " + ammoAmount);
    }
    return ammoAmount - remindAmmo;
  }
  public String getType(){
    return type;
  }
  public void  getStatus(){
    System.out.println("Type: "+type+ " Ammo: "+ammo+ " Base Damage: "+ baseDamage+ " All Damage: "+ damage);
  }
  public boolean isPriority(){
    return type.equals("F35");
  }
}