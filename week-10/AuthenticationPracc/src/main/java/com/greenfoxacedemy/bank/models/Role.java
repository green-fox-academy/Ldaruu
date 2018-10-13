package com.greenfoxacedemy.bank.models;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

  @Entity
  @Table( name = "roles" )
  public class Role {

    @Id
    @GeneratedValue
    private Long id;

    private String role;

    @ManyToMany( mappedBy = "roles")
    private Set<BankAccount> accounts = new HashSet<BankAccount>();

    private Role() {
    }

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public String getRole() {
      return role;
    }

    public void setRole(String role) {
      this.role = role;
    }

    public Set<BankAccount> getAccounts() {
      return accounts;
    }

    public void setAccounts(Set<BankAccount> accounts) {
      this.accounts = accounts;
    }

    @Override
    public String toString() {
      return "Role [id=" + id + ", role=" + role + "]";
    }
  }
