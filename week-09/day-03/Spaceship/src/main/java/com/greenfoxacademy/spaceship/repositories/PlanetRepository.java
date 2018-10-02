package com.greenfoxacademy.spaceship.repositories;

import com.greenfoxacademy.spaceship.models.Planet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanetRepository extends CrudRepository<Planet,Long> {

  List<Planet>findAll();
  Planet findAllById(Long id);
}
