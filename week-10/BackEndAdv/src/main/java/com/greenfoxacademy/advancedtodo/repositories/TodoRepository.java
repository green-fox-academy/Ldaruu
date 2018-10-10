package com.greenfoxacademy.advancedtodo.repositories;

import com.greenfoxacademy.advancedtodo.models.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAll();
}
