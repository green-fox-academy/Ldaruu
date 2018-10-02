package com.greenfoxacademy.spaceship.controllers;

import com.greenfoxacademy.spaceship.services.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SpaceController {

  private static final long shipId = 1L;
  private SpaceService spaceService;

  @Autowired
  public SpaceController(SpaceService spaceService) {
    this.spaceService = spaceService;
  }

  @GetMapping("/")
  public String mainPage(Model model) {
    model.addAttribute("planets", spaceService.getPlanets());
    model.addAttribute("ship", spaceService.getShip(shipId));
    return "index";
  }

  @PostMapping("/movehere/{id}")
  public String moveToOtherPlanet(@PathVariable(value = "id") Long id) {
    spaceService.moveHere(shipId,id);
    return "redirect:/";
  }
}
