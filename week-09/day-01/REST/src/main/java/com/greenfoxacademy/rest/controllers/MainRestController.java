package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.services.ActionServices;
import com.greenfoxacademy.rest.model.Until;
import com.greenfoxacademy.rest.services.AppendaServices;
import com.greenfoxacademy.rest.services.ErrorServices;
import com.greenfoxacademy.rest.services.InputServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

  InputServices inputServices;
  ErrorServices errorServices;
  AppendaServices appendaServices;
  ActionServices actionServices;

  @Autowired
  public MainRestController(InputServices inputServices, ErrorServices errorServices, AppendaServices appendaServices, ActionServices actionServices) {
    this.inputServices = inputServices;
    this.errorServices = errorServices;
    this.appendaServices = appendaServices;
    this.actionServices = actionServices;
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

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<?> appendable(@PathVariable(value = "appendable", required = false) String word) {
    if (word == null) {
      return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Gimme Something Bitch!");
    } else {
      appendaServices.appenda(word);
      return ResponseEntity.ok(appendaServices.getAppenda());
    }
  }

  @PostMapping("/dountil/{action}")
  public Object actionCenter(@PathVariable(value = "action", required = false)String action, @RequestBody( required = false) Until until) {
    if (action==null){
      return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Action heee??");
    }
    actionServices.doAction(action,until);
    return actionServices.getResult();
  }
}