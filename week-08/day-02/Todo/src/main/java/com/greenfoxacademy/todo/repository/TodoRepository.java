package com.greenfoxacademy.todo.repository;

import com.greenfoxacademy.todo.models.Assignee;
import com.greenfoxacademy.todo.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findAllByDoneFalse();

  List<Todo> findAllByDoneTrue();

  List<Todo> findByTitleContaining(String title);

  Todo findAllById(long id);

  List<Todo> findAll();
}
