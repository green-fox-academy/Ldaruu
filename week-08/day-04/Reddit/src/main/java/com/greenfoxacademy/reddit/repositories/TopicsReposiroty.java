package com.greenfoxacademy.reddit.repositories;

import com.greenfoxacademy.reddit.model.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicsReposiroty extends CrudRepository<Topic, Long> {

  List<Topic>findAll();
}
