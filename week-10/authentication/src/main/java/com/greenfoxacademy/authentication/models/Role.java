package com.greenfoxacademy.authentication.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Role {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "role_id")
  private long id;
  @Column(name = "role")
  private String role;

  public Role() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  @Override
  public String toString() {
    return role;
  }
}
