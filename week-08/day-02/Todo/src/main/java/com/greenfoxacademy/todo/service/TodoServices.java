package com.greenfoxacademy.todo.service;

import com.greenfoxacademy.todo.models.Todo;

import java.util.List;

public interface TodoServices  {

  void save (Todo todo);

  Todo findById(long id);

 void deleteById(long id);
}
