package com.greenfoxacademy.todos.repositories;

import com.greenfoxacademy.todos.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository  extends CrudRepository<User, Long> {

  List<User> findAll();
}
