package com.greenfoxacademy.todos.services;

import com.greenfoxacademy.todos.model.Todo;
import com.greenfoxacademy.todos.model.User;
import com.greenfoxacademy.todos.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

  UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public User addUser(String userName, String userEmail) {
    User user = new User(userName, userEmail);
    userRepository.save(user);
    return user;
  }

  @Override
  public List<User> getUsers() {
    return userRepository.findAll();
  }

  @Override
  public User getUserById(Long id) {
    return userRepository.findById(id).orElse(null);
  }

  @Override
  public void removeUser(Long id) {
    userRepository.deleteById(id);
  }

  @Override
  public void saveUser(User user) {
    userRepository.save(user);
  }

  @Override
  @Transactional
  public User addTodo(Long userId, Todo newTodo) {
    User user = userRepository.findById(userId).get();
    user.addTodo(newTodo);
    userRepository.save(user);
    return user;
  }
}
