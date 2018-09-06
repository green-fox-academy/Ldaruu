public class Animal {
  private String name;
  private String type;
  private String owner;

  public Animal(String name, String type, String owner) {
    this.name = name;
    this.type = type;
    this.owner = owner;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {

    this.owner = owner;
  }

  public String toString() {
    return "My name is: " + getName() + " and I have been adopted by: " + getOwner()+"\n";
  }

  //  create an animal shelter application where
//- animals can be stored in a list
//- animals can be adopted by people
//- one person can adopt many animals, but one can be adopted by only one person
//- if an animal is adopted, it is no longer listed in the shelter, but belongs to the adopter person,
//  and the owner of the animal is also stored in the animal object

}
