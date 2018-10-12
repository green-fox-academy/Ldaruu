package com.greenfoxacademy.advancedtodo.services;

import com.greenfoxacademy.advancedtodo.models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

  void addTodo(String title);

  List<Todo>findAll();

  List<Todo> getAlltodos();

}
