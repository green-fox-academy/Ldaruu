package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloRESTController {

  @RequestMapping("/greeting")
  public List<Greeting> greetings(@RequestParam(name = "name") String name) {
    return Arrays.asList(
        new Greeting("Hello World! " + name)
//        new Greeting("Good Morning!\n"),
//        new  Greeting("Guten Morgen!\n")
    );
  }
}
