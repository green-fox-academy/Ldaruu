package com.greenfoxacademy.todos.controller;

import com.greenfoxacademy.todos.model.User;
import com.greenfoxacademy.todos.repositories.UserRepository;
import com.greenfoxacademy.todos.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

  UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/")
  public String showUserspage(Model model) {
    List<User> users = userService.getUsers();
    model.addAttribute("users", users);
    return "users";
  }

  @PostMapping("/removeuser")
  public String removeTodo(@ModelAttribute(value = "removeuser") Long id) {
    userService.removeUser(id);
    return "redirect:/";
  }

  @PostMapping("/users")
  public String addUser(@ModelAttribute(value = "user-name") String userName, @ModelAttribute(value = "user-email") String userEmail) {
    userService.addUser(userName, userEmail);
    return "redirect:";
  }

  @GetMapping("users/{id}/updateuser")
  public String updatePage(@PathVariable(value = "id") Long id, Model model) {
    User user= userService.getUserById(id);
    model.addAttribute("user",user);
    return "updateUser";
  }

  @PostMapping("users/{id}/updateuser")
  public String postUpdate(@ModelAttribute(value = "assignee") User user) {
    userService.saveUser(user);
    return "redirect:/";

  }

  @GetMapping("/users/{id}")
  public String showUserPage(@PathVariable(value = "id") Long id, Model model) {
    User user = userService.getUserById(id);
    model.addAttribute("user", user);
    return "userProfile";
  }
}
