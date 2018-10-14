package com.greenfoxacedemy.bank.services;

import com.greenfoxacedemy.bank.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {

  User getUernameById(long id);

  boolean isUsernameNull(User user);

  boolean isUserExistAlready(String name);

  User getUserAccByPassword(String password);

  User getAccByName(String username);

  User getUserByEmail(String email);

  public String createBankAccount(User user);

  void addNewAccount(User user);

  List<User> findAll();
}
