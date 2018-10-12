package com.greenfoxacedemy.bank.repositories;

import com.greenfoxacedemy.bank.models.BankAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankRepository extends CrudRepository<BankAccount, Long> {

  List<BankAccount> findAll();

  BankAccount findByUsername(String username);

  BankAccount findByPassword(String password);

}
