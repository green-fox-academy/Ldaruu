package com.greenfoxacademy.todo.service;

import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TodoServicesImp implements TodoServices {

  TodoRepository todoRepository;

  @Autowired
  public TodoServicesImp(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public void save(Todo todo) {
    todoRepository.save(todo);

  }

  @Override
  public Todo findById(long id) {
    return todoRepository.findAllById(id);
  }


  @Override
  public void deleteById(long id) {
    todoRepository.deleteById(id);
  }


}
