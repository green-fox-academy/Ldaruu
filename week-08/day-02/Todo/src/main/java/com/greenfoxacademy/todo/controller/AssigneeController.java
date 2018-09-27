package com.greenfoxacademy.todo.controller;

import com.greenfoxacademy.todo.repository.AssigneeRepository;
import com.greenfoxacademy.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("todo")
public class AssigneeController {

  private AssigneeRepository assigneeRepository;
  private TodoRepository todoRepository;

  @Autowired
  public AssigneeController(AssigneeRepository assigneeRepository, TodoRepository todoRepository) {
    this.assigneeRepository = assigneeRepository;
    this.todoRepository = todoRepository;
  }

  @GetMapping("/assignee")
  public String showAssigne(Model model) {
    model.addAttribute("assigneelist", assigneeRepository.findAllBy());
    return "assignee";
  }
}
