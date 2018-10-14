package com.greenfoxacedemy.bank.models;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
  @Table( name = "roles" )
  public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String role;

    @ManyToMany( mappedBy = "roles")
    private Set<User> accounts = new HashSet<User>();

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

    public Set<User> getAccounts() {
      return accounts;
    }

    public void setAccounts(Set<User> accounts) {
      this.accounts = accounts;
    }

    @Override
    public String toString() {
      return "Role [id=" + id + ", role=" + role + "]";
    }
  }
