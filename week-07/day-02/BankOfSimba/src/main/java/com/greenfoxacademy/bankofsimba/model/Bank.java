package com.greenfoxacademy.bankofsimba.model;
import java.util.ArrayList;
import java.util.List;

public class Bank {


 private List<BankAccount> bankAccountList;
 private String name;

  public Bank() {
    this(null);
  }

  public Bank(String name) {
    this.bankAccountList= new ArrayList<>();
    BankAccount simba = new BankAccount("Simba", 2000, "lion");
    BankAccount pumba = new BankAccount("Pumba", 500, "wildboar");
    BankAccount timon = new BankAccount("Timon", 1500, "mongoose");
    BankAccount zazu = new BankAccount("Zazu", 100, "parrot");
    bankAccountList.add(simba);
    bankAccountList.add(pumba);
    bankAccountList.add(timon);
    bankAccountList.add(timon);
    bankAccountList.add(zazu);

    this.name = name;
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
  public void addAccount(BankAccount account) {
    this.bankAccountList.add(account);
  }
}
