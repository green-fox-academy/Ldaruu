package com.greenfoxacademy.bankofsimba.model;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class Bank {

  private List<BankAccount> bankAccountList;
  private String name;

  public Bank() {
    this(null);
  }

  public Bank(String name) {
    this.name = name;
    this.bankAccountList = new ArrayList<>();
    BankAccount simba = new BankAccount("Simba", 2000, "Lion", "Zebra", true, true);
    BankAccount pumba = new BankAccount("Pumba", 500, "Wildboar", "Warms", false, true);
    BankAccount timon = new BankAccount("Timon", 1500, "Mongoose", "Bugs", false, true);
    BankAccount zazu = new BankAccount("Zazu", 100, "Parrot", "Fruits", false, true);
    BankAccount zordon = new BankAccount("Scar", 1200, "Lion", "Zebra", false, false);
    bankAccountList.add(simba);
    bankAccountList.add(pumba);
    bankAccountList.add(timon);
    bankAccountList.add(timon);
    bankAccountList.add(zazu);
    bankAccountList.add(zordon);

  }

  public List<BankAccount> getBank() {
    return bankAccountList;
  }

  public void setBank(List<BankAccount> bank) {
    this.bankAccountList = bank;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void creatAccount(String name, double balance, String animalType, String currency, boolean isKing, boolean isGoog) {
    BankAccount bankAccount1 = new BankAccount(name, balance, currency, animalType, isKing, isGoog);
    addAccount(bankAccount1);
  }

  public void addAccount(BankAccount account) {
    this.bankAccountList.add(account);
  }

  public void addBalance(double numb, int index) {
    bankAccountList.get(index).setBalance(bankAccountList.get(index).getBalance() + numb);
  }
  public void removeAccount(int index) {
    bankAccountList.remove(index);

  }
  public void withDrawMoney(double balance, int index) {
    bankAccountList.get(index).setBalance(bankAccountList.get(index).getBalance()-balance);
  }
}
