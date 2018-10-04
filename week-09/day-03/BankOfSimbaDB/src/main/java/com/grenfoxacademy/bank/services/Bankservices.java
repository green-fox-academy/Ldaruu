package com.grenfoxacademy.bank.services;

import com.grenfoxacademy.bank.models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Bankservices {

  BankAccount getUernameById(long id);

  boolean isUsernameNull(BankAccount bankAccount);

  boolean isUserExistAlready(String name);

  BankAccount getUserAccByPassword(String password);

  BankAccount getAccByName(String username);

  BankAccount createBankAccount(String username,String password);

  void addNewAccount(BankAccount bankAccount);

  List<BankAccount> findAll();


}
