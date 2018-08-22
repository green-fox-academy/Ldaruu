public abstract class Animal {

  protected String name;
  protected int age;
  protected String gender;
  protected int numOfLegs;

  public Animal() {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.numOfLegs = numOfLegs;
  }

  public abstract String breed ();

  public abstract String move();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

