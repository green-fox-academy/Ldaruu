package com.greenfoxacademy.spaceship.services;

import com.greenfoxacademy.spaceship.models.Planet;
import com.greenfoxacademy.spaceship.models.Spaceship;
import com.greenfoxacademy.spaceship.repositories.PlanetRepository;
import com.greenfoxacademy.spaceship.repositories.SpaceshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SpaceServiceImpl implements SpaceService {

  private SpaceshipRepository spaceshipRepository;
  private PlanetRepository planetRepository;

  @Autowired
  public SpaceServiceImpl(SpaceshipRepository spaceshipRepository, PlanetRepository planetRepository) {
    this.spaceshipRepository = spaceshipRepository;
    this.planetRepository = planetRepository;
  }

  @Override
  public List<Planet> getPlanets() {
    return planetRepository.findAll();
  }

  @Override
  public Spaceship getShip(long id) {
    return spaceshipRepository.findById(id).get();
  }

  @Override
  public void moveHere(long shipId, long planetId) {
    String planetName = planetRepository.findById(planetId).get().getName();
    Spaceship spaceship = spaceshipRepository.findById(shipId).get();
    if (planetName == (spaceship.getPlanet())) {
      return;
    }
    spaceship.setPlanet(planetName);
    spaceshipRepository.save(spaceship);
  }
}
