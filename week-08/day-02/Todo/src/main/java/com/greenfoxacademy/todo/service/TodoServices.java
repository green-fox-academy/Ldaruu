package com.greenfoxacademy.todo.service;

import com.greenfoxacademy.todo.models.Assignee;
import com.greenfoxacademy.todo.models.Todo;
import org.springframework.ui.Model;

import java.util.List;

public interface TodoServices {

  List<Todo> findAll();

  void save(Todo todo);

  Todo findById(long id);

  void deleteById(long id);

  void active(String active, Model model);

  void update(Long id, Model model);

  void search(String title, Model model);

  void  add(String todo, Model model);
}
