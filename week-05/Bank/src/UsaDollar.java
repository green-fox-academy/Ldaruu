public class UsaDollar extends Currency {

public  UsaDollar (){

}
  public UsaDollar(int value) {
    super(value);
    this.code = "USD";
    this.bankName = "Federal Reserve System";
  }
public int getVallue(){
    return value;

}

}

// Create a UsaDollar class that inherits from the Currency.
// Create a constructor that accepts the value.
// The code should be "USD"
// and the central bank name should be "Federal Reserve System"
