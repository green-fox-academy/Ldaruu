package com.greenfoxacademy.reddit.repositories;

import com.greenfoxacademy.reddit.model.Topics;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicsReposiroty extends CrudRepository<Topics, Long> {

  List<Topics>findAll();
}
