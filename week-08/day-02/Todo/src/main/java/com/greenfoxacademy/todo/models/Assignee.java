package com.greenfoxacademy.todo.models;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String email;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "todo_id")
  private Todo todo;

  public Assignee() {
  }

  public Assignee(String name) {
    this.name = name;
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

  public void setTodo(Todo todo) {
    this.todo = todo;
  }

  public Todo getTodo() {
    return todo;
  }
}
