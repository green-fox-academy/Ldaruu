package com.greenfoxacademy.foxclub.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Fox {

  private String name;
  private String food;
  private String drink;
  private List<Tricks> tricks;

  public Fox() {
    food = "salad";
    drink = "water";
    tricks = new ArrayList<>();
  }

  public Fox(String name) {
    this.name = name;
    food = "salad";
    drink = "water";
    tricks = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public List<Tricks> getTricks() {
    return tricks;
  }

  public void setTricks(List<Tricks> tricks) {
    this.tricks = tricks;
  }
}
