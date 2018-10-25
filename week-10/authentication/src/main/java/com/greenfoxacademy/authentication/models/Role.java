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
}
