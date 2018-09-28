package com.greenfoxacademy.todo.repository;

import com.greenfoxacademy.todo.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {

  List<Assignee> findAll();
}
