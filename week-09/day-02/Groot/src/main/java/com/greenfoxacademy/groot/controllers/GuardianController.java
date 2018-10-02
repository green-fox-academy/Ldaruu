package com.greenfoxacademy.groot.controllers;

import com.greenfoxacademy.groot.services.GuardianServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  private GuardianServices guardianServices;

  @Autowired
  public GuardianController(GuardianServices guardianServices) {
    this.guardianServices = guardianServices;
  }

  @GetMapping("/groot")
  public ResponseEntity<?> grootMessage(@RequestParam(value = "message", required = false) String message) {
    if (message == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(guardianServices.errormessage());
    } else {
      return ResponseEntity.ok().body(guardianServices.getmessage(message));
    }
  }
}
