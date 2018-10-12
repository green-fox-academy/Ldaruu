package com.greenfoxacedemy.bank.services;

import com.greenfoxacedemy.bank.models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {

  BankAccount getUernameById(long id);

  boolean isUsernameNull(BankAccount bankAccount);

  boolean isUserExistAlready(String name);

  BankAccount getUserAccByPassword(String password);

  BankAccount getAccByName(String username);

  BankAccount createBankAccount(String username,String password);

  void addNewAccount(BankAccount bankAccount);

  List<BankAccount> findAll();
}
