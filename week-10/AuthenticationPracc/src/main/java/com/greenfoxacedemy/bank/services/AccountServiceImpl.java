package com.greenfoxacedemy.bank.services;

import com.greenfoxacedemy.bank.models.BankAccount;
import com.greenfoxacedemy.bank.repositories.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

  private BankRepository bankRepository;

  @Autowired
  public AccountServiceImpl(BankRepository bankRepository) {
    this.bankRepository = bankRepository;
  }

  @Override
  public BankAccount getUernameById(long id) {
    return bankRepository.findById(id).get();
  }


  @Override
  public boolean isUsernameNull(BankAccount bankAccount) {
    return (bankAccount.getUsername().isEmpty());
  }

  @Override
  public boolean isUserExistAlready(String name) {
    BankAccount bankAccount = bankRepository.findByUsername(name);
    return (bankAccount != null);
  }

  @Override
  public BankAccount getUserAccByPassword(String password) {
    return bankRepository.findByPassword(password);
  }

  @Override
  public BankAccount getAccByName(String username) {
    return bankRepository.findByUsername(username);
  }

  @Override
  public BankAccount createBankAccount(String username, String password) {
    BankAccount bankAccount = new BankAccount(username, password);
    bankRepository.save(bankAccount);
    return bankAccount;

  }

  @Override
  public void addNewAccount(BankAccount bankAccount) {
    bankRepository.save(bankAccount);
  }

  @Override
  public List<BankAccount> findAll() {
    return bankRepository.findAll();
  }

}
