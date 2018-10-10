package com.greenfoxacademy.advancedtodo.controllers;

import com.greenfoxacademy.advancedtodo.models.Todo;
import com.greenfoxacademy.advancedtodo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.method.P;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoRestController {

  private TodoService todoService;

  @Autowired
  public TodoRestController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping("api/todos")
  public Object listAllTodo() {
    List<Todo> todos = todoService.findAll();
    return todos;
  }

  @PostMapping("api/add")
  public Object addTodo(@RequestBody(required = false) String title) {
    if (title != null){
      todoService.addTodo(title);
    }
    return todoService.findAll();
  }

}
