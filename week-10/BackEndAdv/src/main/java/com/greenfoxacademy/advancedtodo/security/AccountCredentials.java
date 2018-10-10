package com.greenfoxacademy.advancedtodo.security;

public class AccountCredentials {

  private String username;
  private String password;
  // getters & setters

  public String getUsername() {
    return username;
  }

  public AccountCredentials(String username, String password) {
    this.username = username;
    this.password = password;
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
}
