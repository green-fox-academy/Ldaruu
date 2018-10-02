package com.greenfoxacademy.spaceship.services;

import com.greenfoxacademy.spaceship.models.Planet;
import com.greenfoxacademy.spaceship.models.Spaceship;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.LocalScoping;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpaceService {

  List<Planet> getPlanets();

  Spaceship getShip(Long id);
}
