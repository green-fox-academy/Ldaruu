package com.greenfoxacademy.spaceship.repositories;

import com.greenfoxacademy.spaceship.models.Planet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepository extends CrudRepository<Planet,Long> {
}
