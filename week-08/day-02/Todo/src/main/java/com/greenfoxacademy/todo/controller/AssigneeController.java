package com.greenfoxacademy.todo.controller;

import com.greenfoxacademy.todo.models.Assignee;
import com.greenfoxacademy.todo.service.AssigneeService;
import com.greenfoxacademy.todo.service.TodoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    model.addAttribute("assigneelist", assigneeService.findAll());
    return "assignee";
  }

  @PostMapping("/removeassignee")
  public String removeTodo(@ModelAttribute(value = "removeass") Long id) {
    assigneeService.removeAssigne(id);
    return "redirect:/todo/assignee";
  }
  @GetMapping("assignee/{id}/updateassignee")
  public String updatePage(@PathVariable(value = "id") Long id, Model model) {
    assigneeService.update(id, model);
    return "updateassignee";
  }
  @PostMapping("assignee/{id}/updateassignee")
  public String postUpdate(@ModelAttribute(value = "assignee") Assignee assignee) {
    assigneeService.saveAssigne(assignee);
    return "redirect:/todo/assignee";

  }

  @GetMapping("assignee/addAssignee")
  public String addAssignee() {
    return "addAssignee";
  }

//  @PostMapping("/addTodo")
//  public String addTodo(Model model, @ModelAttribute(value = "todo") String todo) {
//    todoServices.add(todo, model);
//    return "redirect:/todo/";
//  }

}
