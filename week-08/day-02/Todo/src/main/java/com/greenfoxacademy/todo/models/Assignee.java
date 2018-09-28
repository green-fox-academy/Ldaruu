package com.greenfoxacademy.todo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String email;

  @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER, mappedBy = ("assignee"))
//  @JoinColumn(name = "todo_id")
  private List<Todo> todoList;


  public Assignee() {

  }

  public Assignee(String name) {
    this.name = name;
    todoList = new ArrayList<>();
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

  public List<Todo> getTodo() {
    return todoList;
  }

  public void setTodo(List<Todo> todoList) {
    this.todoList = todoList;
  }

  public void giveTodo(Todo todo) {
    todoList.add(todo);
    todo.setAssignee(this);
  }
}
