package com.greenfoxacademy.todos.controller;

import com.greenfoxacademy.todos.model.User;
import com.greenfoxacademy.todos.repositories.UserRepository;
import com.greenfoxacademy.todos.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

  UserService userService;

  @Autowired
  public UserController(UserService userService ) {
    this.userService = userService;
  }

  @GetMapping("/")
  public String showUserspage(Model model) {
    List<User> users = userService.getUsers();
    model.addAttribute("users", users);
    return "users";
  }

  @PostMapping("/users")
  public String addUser(@ModelAttribute(value = "user-name") String userName, @ModelAttribute(value = "user-email") String userEmail) {
    userService.addUser(userName, userEmail);
    return "redirect:";
  }
}
