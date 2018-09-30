package com.greenfoxacademy.todo.service;

import com.greenfoxacademy.todo.models.Assignee;
import com.greenfoxacademy.todo.models.Todo;
import org.springframework.ui.Model;

import java.util.List;

public interface AssigneeService {


  List<Assignee> findAll();
  List<Assignee> findAllByid(Long id);

  void addNewAssignee(String name, String email);

  void removeAssigne(long id);

  void editAssigne(long id);

  void saveAssigne(Assignee assignee);

  void update(Long id, Model model);

  void addTodo(Long id, Todo todo);

  Assignee getassigneeById(Long id);
}
