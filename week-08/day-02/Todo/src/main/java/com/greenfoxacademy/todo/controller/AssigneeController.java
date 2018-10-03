package com.greenfoxacademy.todo.controller;

import com.greenfoxacademy.todo.models.Assignee;
import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.repository.AssigneeRepository;
import com.greenfoxacademy.todo.service.AssigneeService;
import com.greenfoxacademy.todo.service.TodoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("assignee")
public class AssigneeController {

  private AssigneeService assigneeService;
  private AssigneeRepository assigneeRepository;
  private TodoServices todoServices;

  @Autowired
  public AssigneeController(AssigneeService assigneeService,TodoServices todoServices, AssigneeRepository assigneeRepository) {
    this.assigneeService = assigneeService;
    this.assigneeRepository = assigneeRepository;
    this.todoServices=todoServices;
  }

  @GetMapping("todo/assignee")
  public String showAssigne(Model model) {
    model.addAttribute("assigneelist", assigneeService.findAll());
    return "assignee";
  }

  @PostMapping("todo/removeassignee")
  public String removeTodo(@ModelAttribute(value = "removeass") Long id) {
    assigneeService.removeAssigne(id);
    return "redirect:/todo/assignee";
  }

  @GetMapping("todo/assignee/{id}/updateassignee")
  public String updatePage(@PathVariable(value = "id") Long id, Model model) {
    assigneeService.update(id, model);
    return "updateassignee";
  }

  @PostMapping("/todo/assignee/{id}/updateassignee")
  public String postUpdate(@ModelAttribute(value = "assignee") Assignee assignee) {
    assigneeService.saveAssigne(assignee);
    return "redirect:/todo/assignee";

  }

  @GetMapping("todo/assignee/addAssignee")
  public String addAssignee() {
    return "addAssignee";
  }

  @PostMapping("todo/assignee/addAssignee")
  public String addTodo(@RequestParam(value = "name") String name, @RequestParam(value = "email") String email) {
    assigneeService.addNewAssignee(name, email);
    return "redirect:/todo/assignee";
  }

//  @PostMapping("/assignee/addTodo")
//  public String assignTodo(@PathVariable(value = "id")Long id,@ModelAttribute(value = "todo") Todo todo) {
//    assigneeRepository.findAllById(id).a
//  }

  @GetMapping("todo/assignee/{id}/assigneeProfile")
  public String showAssigneePage(@PathVariable(value = "id") Long id,@ModelAttribute(value = "assignee")Assignee assignee, Model model) {
    assigneeService.findById(id);
    model.addAttribute("assignee", assignee);
    model.addAttribute("newTodo", new Todo());
    return "assigneeProfile";
  }

}
