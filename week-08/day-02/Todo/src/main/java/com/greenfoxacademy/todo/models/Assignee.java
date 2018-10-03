package com.greenfoxacademy.todo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String email;

//  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "assignee")
//  private List<Todo> todos;


  public Assignee() {

  }

  public Assignee(String name) {
    this.name = name;
//    todos = new ArrayList<>();
  }

  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

//  public List<Todo> getTodo() {
//    return todos;
//  }
//
//  public void setTodo(List<Todo> todoList) {
//    this.todos = todoList;
//  }
//
//  public void addTodo(Todo todo) {
//    this.todos.add(todo);
//    todo.setAssignee(this);
//  }

  @Override
  public String toString() {
    return this.name ;
  }
}
