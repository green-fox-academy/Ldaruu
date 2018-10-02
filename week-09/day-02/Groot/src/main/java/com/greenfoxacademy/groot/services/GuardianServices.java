package com.greenfoxacademy.groot.services;

import com.greenfoxacademy.groot.models.Groot;
import com.greenfoxacademy.groot.models.GrootError;

public interface GuardianServices {

  Groot getmessage(String message);
  GrootError errormessage();
}
