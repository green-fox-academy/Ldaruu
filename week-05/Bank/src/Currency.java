public class Currency {
  protected String code;
  protected String bankName;
  protected int value;

  public Currency(){

  }
  public Currency(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}

// Create a Currency class.
// It should have a code, a central bank name and a value field.
// Create a constructor for setting those values.