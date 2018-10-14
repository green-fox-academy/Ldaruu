package com.greenfoxacedemy.bank.models;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String username;
  @Column( nullable=false )
  private String password;
  private String fullName;
  private long balance;
  @Column( unique=true, nullable=false )
  private String email;
  private String address;


  @ManyToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER )
  @JoinTable(
      name = "users_roles",
      joinColumns = {@JoinColumn(name="bankaccount_id")},
      inverseJoinColumns = {@JoinColumn(name="role_id")}
  )
  private Set<Role> roles = new HashSet<Role>();

  public User() {
  }

  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public User(String username, String password, String email) {
    this.username = username;
    this.password = password;
    this.email = email;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }

  public void addRoles(String roleName) {
    if (this.roles == null || this.roles.isEmpty())
      this.roles = new HashSet<>();
    this.roles.add(new Role(roleName));
  }

  @Override
  public String toString() {
    return "User [id=" + id + ", email=" + email + ", password=" + password + "]";
  }
}
