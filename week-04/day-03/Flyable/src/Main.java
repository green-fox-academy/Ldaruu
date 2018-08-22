public class Main {
  public static void main(String[] args) {

    Bird blackSwan = new Bird("Swan");
    Helicopter apache =new Helicopter("Apache",8, "green");

    System.out.println("Info about :");
    System.out.println(blackSwan.getName()+ ": is a type of bird  which "+ blackSwan.breed()+" and " +blackSwan.takeOff()+ " and "+
        blackSwan.fly()+" and "+ blackSwan.land());
    System.out.println(apache.getName()+ ": is a Helicopter which is "+apache.getAge()+" old and it has "+ apache.getColor() + " color. "+
        apache.getName()+ " can "+ apache.takeOff()+" and "+apache.fly()+" and has "+ apache.land());



  }
}
