package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloName {


  @RequestMapping("/greeting")

    @ResponseBody
    public String helloName(@RequestParam(name = "name") String name) {
      return "Hello " + name;

    }
}
