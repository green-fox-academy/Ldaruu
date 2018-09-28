package com.greenfoxacademy.todo.controller;

import com.greenfoxacademy.todo.service.AssigneeService;
import com.greenfoxacademy.todo.service.TodoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("todo")
public class AssigneeController {

  private AssigneeService assigneeService;
  private TodoServices todoServices;

  @Autowired
  public AssigneeController(AssigneeService assigneeService, TodoServices todoServices) {
    this.assigneeService = assigneeService;
    this.todoServices = todoServices;
  }

  @GetMapping("/assignee")
  public String showAssigne(Model model) {
    assigneeService.findAllBy(model);
    return "assignee";
  }
}
