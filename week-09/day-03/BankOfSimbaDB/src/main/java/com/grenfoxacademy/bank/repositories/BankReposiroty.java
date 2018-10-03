package com.grenfoxacademy.bank.repositories;

import com.grenfoxacademy.bank.models.BankAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankReposiroty extends CrudRepository<BankAccount, Long> {
  List<BankAccount>findAll();

  BankAccount findByUsername(String username);
}
