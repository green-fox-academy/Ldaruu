package com.greenfoxacademy.helloworldbean.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
  ArrayList<String> colors;
  Random random;
  String email;


  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }

  public String caesar(String text, int number) {
    String result = "";
    for(int i = 0; i < text.length(); i++) {
      result += (char)((int)text.charAt(i) + number);
    }
    return result;
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

  public boolean emailValidation() {
    if (email.contains("@") && email.contains(".")) {
      return true;
    } else {
      return false;
    }
  }

  public ArrayList<String> getColors() {
    return colors;
  }

  public void setColors(ArrayList<String> colors) {
    this.colors = colors;
  }

  public Random getRandom() {
    return random;
  }

  public void setRandom(Random random) {
    this.random = random;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
