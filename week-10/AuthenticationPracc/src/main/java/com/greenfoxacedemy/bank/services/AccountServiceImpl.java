package com.greenfoxacedemy.bank.services;

import com.greenfoxacedemy.bank.models.User;
import com.greenfoxacedemy.bank.repositories.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService, UserDetailsService {

  private BankRepository bankRepository;

  @Autowired
  public AccountServiceImpl(BankRepository bankRepository) {
    this.bankRepository = bankRepository;
  }

  @Override
  public User getUernameById(long id) {
    return bankRepository.findById(id).get();
  }


  @Override
  public boolean isUsernameNull(User user) {
    return (user.getUsername().isEmpty());
  }

  @Override
  public boolean isUserExistAlready(String name) {
    User user = bankRepository.findByUsername(name);
    return (user != null);
  }

  @Override
  public User getUserAccByPassword(String password) {
    return bankRepository.findByPassword(password);
  }

  @Override
  public User getAccByName(String username) {
    return bankRepository.findByUsername(username);
  }

  @Override
  public User getUserByEmail(String email) {
    return bankRepository.findByEmail(email);
  }

  @Override
  public User createBankAccount(String username, String password,String email) {
    User user = new User(username, password, email);
    bankRepository.save(user);
    return user;

  }

  @Override
  public void addNewAccount(User user) {
    bankRepository.save(user);
  }

  @Override
  public List<User> findAll() {
    return bankRepository.findAll();
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    System.out.println("Loading User");
    User user = getAccByName(username);
    if (user == null) {
      throw new UsernameNotFoundException(username);
    }

    return new UserDetailsImpl(user);
  }
}
