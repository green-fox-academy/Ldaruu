package com.greenfoxacademy.spaceship.services;

import com.greenfoxacademy.spaceship.models.Planet;
import com.greenfoxacademy.spaceship.models.Spaceship;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpaceService {

  List<Planet> getPlanets();

  Spaceship getShip(long id);

  void moveHere(long shipId, long planetId);

  void movePplToSip(long shipId, long planetId);

  void movePplToPlanet(long shipId, long planetId);
}
