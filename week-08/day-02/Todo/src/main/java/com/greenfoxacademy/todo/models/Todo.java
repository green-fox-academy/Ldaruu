package com.greenfoxacademy.todo.models;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private boolean urgent;
  private boolean done;

  @CreationTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm")
  @Column(name = "CREATEAT")
  private Date createAt;


  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private Assignee assignee;

  public Todo() {
  }

  public Todo(String title) {
    this.title = title;
    this.urgent = false;
    this.done = false;
  }

  public Todo(String title, boolean urgent, boolean done) {
    this.title = title;
    this.urgent = urgent;
    this.done = done;
  }

  public Todo(Long id, String title, boolean urgent, boolean done) {
    this.id = id;
    this.title = title;
    this.urgent = urgent;
    this.done = done;
  }

  public Todo(String title, boolean urgent, boolean done, Date createAt) {
    this.title = title;
    this.urgent = urgent;
    this.done = done;
    this.createAt = createAt;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean getUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean getDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }

  public Date getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Date createAt) {
    this.createAt = createAt;
  }
}


