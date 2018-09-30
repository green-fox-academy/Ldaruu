package com.greenfoxacademy.todos.services;

import com.greenfoxacademy.todos.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

  User addUser(String userName, String userEmail);

  List<User> getUsers();
}
