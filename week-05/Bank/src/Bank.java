public class Bank {
  int allMoney;

  public Bank() {

  }

  public void createAccount(BankAccount account) {
    allMoney += account.getMoney();

  }

  public int getAllMoney() {

    return allMoney;
  }
}
// Create a Bank class which can store BankAccounts.
// It should have a createAccount method with a BankAccount as an input parameter.
// It should have a getAllMoney method, which returns the sum of
// the accounts' money (sum of Currency values regardless of the Currency type).