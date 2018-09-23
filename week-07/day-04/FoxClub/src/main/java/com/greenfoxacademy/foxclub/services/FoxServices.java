package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.models.Tricks;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxServices {

  private List<Fox> foxes;

  public FoxServices() {
    foxes = new ArrayList<>();
  }

  public List<Fox> getFoxes() {
    return foxes;
  }

  public void createFoxandAddToList(String name) {
    Fox fox = new Fox(name);
    foxes.add(fox);
  }

  public Fox getFoxFromListByName(String name) {
    int index = 0;
    for (int i = 0; i < foxes.size(); i++) {
      if (name.equals(foxes.get(i).getName())) {
        index = i;
      }
    }
    return foxes.get(index);
  }

  public boolean isFoxinTheList(String name) {
    for (int i = 0; i < foxes.size(); i++) {
      if (name.equals(foxes.get(i).getName())) {
        return true;
      }
    }
    return false;
  }

  public void setFoxFood(String name, String food) {
    getFoxFromListByName(name).setFood(food);
  }

  public void setFoxDrink(String name, String drink) {
    getFoxFromListByName(name).setDrink(drink);
  }

  public void addTrickByName(String name, String trick) {
    getFoxFromListByName(name).getTricks().add(new Tricks(trick));
  }

  public boolean isTrickInList(String name, String trick) {
    for (int i = 0; i < getFoxFromListByName(name).getTricks().size(); i++) {
      if (getFoxFromListByName(name).getTricks().get(i).getTrickName().equals(trick)) {
        return true;
      }
    }
    return false;
  }
}