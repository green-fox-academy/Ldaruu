package com.greenfoxacademy.spaceship.repositories;

import com.greenfoxacademy.spaceship.models.Spaceship;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceshipRepository extends CrudRepository<Spaceship,Long> {
  Spaceship findAllById(Long id);
}
