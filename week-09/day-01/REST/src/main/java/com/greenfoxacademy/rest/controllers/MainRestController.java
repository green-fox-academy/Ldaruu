package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.services.InputServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  InputServices inputServices;

  @Autowired
  public MainRestController(InputServices inputServices) {
    this.inputServices = inputServices;
  }

  @GetMapping("/doubling")
  public ResponseEntity<?> doubling(@RequestParam(value = "input", required = false) Long received) {
    if (received == null) {
      return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Gimme Something Bitch!");
    } else {
      inputServices.setReceived(received);
      inputServices.getResult();
      return ResponseEntity.ok(inputServices.getDoubling());
    }
  }
}
