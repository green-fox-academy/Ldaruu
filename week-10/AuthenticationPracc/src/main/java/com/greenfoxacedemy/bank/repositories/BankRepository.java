package com.greenfoxacedemy.bank.repositories;

import com.greenfoxacedemy.bank.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankRepository extends CrudRepository<User, Long> {

  List<User> findAll();

  User findByUsername(String username);

  User findByPassword(String password);

  User findByEmail(String email);

}
