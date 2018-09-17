package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {


  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
  int fontSize = 100;

  public String textColor() {
    int r = (int) (Math.random() * 255);
    int g = (int) (Math.random() * 255);
    int b = (int) (Math.random() * 255);
    String rgbColors = "rgb(" + r + "," + g + "," + b + ")";
    return rgbColors;

  }


  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam(name = "name") String name) {
    Greeting greeting = new Greeting(name);
    model.addAttribute("content", greeting.getContent());
    model.addAttribute("id", greeting.getId());
    model.addAttribute("greetings", hellos[(int) (Math.random() * hellos.length)]);
    model.addAttribute("fontsize", (int) (Math.random() * fontSize));
    model.addAttribute("fontColor", textColor());
    return "greeting";
  }

}
