package com.grenfoxacademy.bank.services;

import com.grenfoxacademy.bank.models.BankAccount;
import com.grenfoxacademy.bank.repositories.BankReposiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements Bankservices {

  private BankReposiroty bankReposiroty;

  @Autowired
  public BankServiceImpl(BankReposiroty bankReposiroty) {
    this.bankReposiroty = bankReposiroty;
  }

  @Override
  public BankAccount getUernameById(long id) {
    return bankReposiroty.findById(id).get();
  }

  @Override
  public boolean isUsernameNull(BankAccount bankAccount) {
    return (bankAccount.getUsername().isEmpty());
  }

  @Override
  public boolean isUserExistAlready(String name) {
    BankAccount bankAccount = bankReposiroty.findByUsername(name);
    return (bankAccount != null);
  }

  @Override
  public BankAccount getAccByName(String username) {
    return bankReposiroty.findByUsername(username);
  }

  @Override
  public BankAccount createBankAccount(String username) {
    BankAccount bankAccount= new BankAccount(username);
    return bankAccount;
  }


}
