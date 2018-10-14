package com.greenfoxacedemy.bank.services;

import com.greenfoxacedemy.bank.models.Role;
import com.greenfoxacedemy.bank.models.User;
import com.greenfoxacedemy.bank.repositories.BankRepository;
import com.greenfoxacedemy.bank.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService, UserDetailsService {

  private BankRepository bankRepository;
  private RoleRepository roleRepository;

  private final String USER_ROLE = "USER";

  @Autowired
  public AccountServiceImpl(BankRepository bankRepository, RoleRepository roleRepository) {
    this.roleRepository = roleRepository;
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
  public String createBankAccount(User userToRegister) {
    User userCheck = bankRepository.findByEmail(userToRegister.getEmail());
    if (userCheck != null)
      return "alreadyExists";
    Role userRole = roleRepository.findByRole(USER_ROLE);
    if (userRole != null) {
      userToRegister.getRoles().add(userRole);
    } else {
      userToRegister.addRoles(USER_ROLE);
    }

    bankRepository.save(userToRegister);
    return "ok";
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
