package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  private String currency;
  private boolean isKing;
  private boolean isBad;

  public BankAccount() {
  }

  public BankAccount(String name, double balance, String animalType, String currency, boolean isKing, boolean isBad) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = currency;
    this.isKing = isKing;
    this.isBad = isBad;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public boolean isKing() {
    return isKing;
  }

  public void setKing(boolean king) {
    isKing = king;
  }

  public boolean isBad() {
    return isBad;
  }

  public void setBad(boolean bad) {
    isBad = bad;
  }
}
