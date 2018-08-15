package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Dominoes> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...
    dominoes = orderDominoes(dominoes);

    System.out.println(dominoes);

  }

  static List<Dominoes> initializeDominoes() {
    List<Dominoes> dominoes = new ArrayList<>();
    dominoes.add(new Dominoes(5, 2));
    dominoes.add(new Dominoes(4, 6));
    dominoes.add(new Dominoes(1, 5));
    dominoes.add(new Dominoes(6, 7));
    dominoes.add(new Dominoes(2, 4));
    dominoes.add(new Dominoes(7, 1));
    return dominoes;
  }

  static List<Dominoes> orderDominoes(List<Dominoes> dominoesToOrder) {
    List<Dominoes> orderedDominoes = new ArrayList<>();
    orderedDominoes.add(dominoesToOrder.get(0));
    int valueToLookFor = dominoesToOrder.get(0).getValues()[1];

    for (int i = 1; i < dominoesToOrder.size(); i++) {
      for (int j = 0; j < dominoesToOrder.size(); j++) {
        int currentValue = dominoesToOrder.get(j).getValues()[0];

        if (valueToLookFor == currentValue) {
          orderedDominoes.add(dominoesToOrder.get(j));
          valueToLookFor = dominoesToOrder.get(j).getValues()[1];
          break;
        }
      }
    }
    return orderedDominoes;
  }
}