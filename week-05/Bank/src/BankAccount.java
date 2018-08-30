public class BankAccount extends Bank {
  String name;
  String pin;
  int money;


  public BankAccount(String name, String pin, Currency account) {
    this.name = name;
    this.pin = pin;
    money = account.getValue();
  }

  public void deposit(int value) {
    // Create a deposit method which check if the given parameter is positive
// then adds the parameter to the Currency's value field.
    if (value > 0) {
     this.money += value;
    }
  }

  public int getMoney() {
    return money;
  }

  public int withdraw(String pin, int amount) {
    if (pin.equals(this.pin) && money >= amount) {
      this.money -= amount;
      return amount;
    } else {
      return 0;
    }

    // Create a withdraw method with two parameters: a pin code and an amount.
// It should check if the given pin is correct (equals with the original pin)
// and the Currency's value is more than the amount parameter.
// If so, subtract the amount from the Currency's value and return with the amount.
// Otherwise don't modify the Currency's value and return with 0.

  }
}
// Create a BankAccount class.
// It should have a name, a pin code and a Currency field.
// Create a constructor for setting those values.