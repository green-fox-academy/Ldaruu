package com.greenfoxacademy.todo.repository;

import com.greenfoxacademy.todo.models.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findAllByDoneFalse();
  List<Todo> findAllByDoneTrue();
}
