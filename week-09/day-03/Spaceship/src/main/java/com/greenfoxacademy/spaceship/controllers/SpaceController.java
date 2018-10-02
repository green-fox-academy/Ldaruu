package com.greenfoxacademy.spaceship.controllers;

import com.greenfoxacademy.spaceship.services.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpaceController {

  private SpaceService spaceService;

  @Autowired
  public SpaceController(SpaceService spaceService) {
    this.spaceService = spaceService;
  }
  @GetMapping("/")
  public String mainPage(Model model){
    model.addAttribute("planets", spaceService.getPlanets());
    model.addAttribute("ship", spaceService.getShip(1L));
    return "index";
  }
}
