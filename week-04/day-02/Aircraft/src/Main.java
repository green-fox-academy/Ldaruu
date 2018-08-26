public class Main {
  public static void main(String[] args) {
    Carrier myCarrier =  new Carrier(1000, 1500);
    Carrier otherCarrier = new Carrier(500, 1500);
    Aircrafts myF161 = new F16();
    Aircrafts myF162 = new F16();
    Aircrafts myF163 = new F16();
    Aircrafts myF164 = new F16();
    Aircrafts myF165 = new F16();
    Aircrafts myF351= new F35();
    Aircrafts myF352= new F35();
    Aircrafts myF353= new F35();
    Aircrafts myF354= new F35();
    Aircrafts myF355= new F35();

    myCarrier.addAircraft(myF161);
    myCarrier.addAircraft(myF162);
    myCarrier.addAircraft(myF163);
    myCarrier.addAircraft(myF351);
    myCarrier.addAircraft(myF352);

    otherCarrier.addAircraft(myF164);
    otherCarrier.addAircraft(myF165);
    otherCarrier.addAircraft(myF353);
    otherCarrier.addAircraft(myF354);
    otherCarrier.addAircraft(myF355);


    myCarrier.fill();
    otherCarrier.fill();

    myCarrier.getStatus();
    otherCarrier.getStatus();
  }
}
