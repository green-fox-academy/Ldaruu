package com.greenfoxacademy.todos.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long userId;
  private String name;
  private String email;

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  public List<Todo> todos;


  public User() {
    this(null);

  }

  public User(String name) {
    this.name = name;
    todos = new ArrayList<>();
  }

  public User(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public long getId() {
    return userId;
  }

  public void setId(long id) {
    this.userId = id;
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

  public List<Todo> getTodo() {
    return todos;
  }

  public void setTodo(List<Todo> todoList) {
    this.todos = todoList;
  }

  public void addTodo(Todo todo) {
    this.todos.add(todo);
//    todo.setUser(this);
  }
}

