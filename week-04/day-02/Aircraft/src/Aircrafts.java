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

  public String getType() {
    if (this instanceof F16) {
      return "F16";
    } else if (this instanceof F35) {
      return "F35";
    } else {
      return "This is something else";
    }
  }
  public void getStatus() {
    System.out.println("Type: " + type + " Ammo: " + ammo + " Base Damage: " + baseDamage + " All Damage: " + damage);
  }

  public boolean isPriority() {
    return this.getType() == "F35";
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getMaxammo() {
    return maxammo;
  }

  public void setMaxammo(int maxammo) {
    this.maxammo = maxammo;
  }

  public int getAmmo() {
    return ammo;
  }

  public void setAmmo(int ammo) {
    this.ammo = ammo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }
}