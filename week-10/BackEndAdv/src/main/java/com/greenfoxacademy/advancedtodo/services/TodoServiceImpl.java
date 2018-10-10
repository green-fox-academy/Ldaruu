package com.greenfoxacademy.advancedtodo.services;

import com.greenfoxacademy.advancedtodo.models.Todo;
import com.greenfoxacademy.advancedtodo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

  private TodoRepository todoRepository;

  @Autowired
  public TodoServiceImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public void addTodo(String title) {
    Todo todo = new Todo(title);
    todoRepository.save(todo);
  }

  @Override
  public List<Todo> findAll() {
    return todoRepository.findAll();
  }
}
