package com.greenfoxacademy.todo.controller;

import com.greenfoxacademy.todo.models.Assignee;
import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.repository.AssigneeRepository;
import com.greenfoxacademy.todo.repository.TodoRepository;
import com.greenfoxacademy.todo.service.AssigneeService;
import com.greenfoxacademy.todo.service.TodoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("todo")
public class TodoController {


  private TodoServices todoServices;
  private AssigneeService assigneeService;
  private AssigneeRepository assigneeRepository;
  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoServices todoServices, AssigneeService assigneeService, AssigneeRepository assigneeRepository, TodoRepository todoRepository) {
    this.todoServices = todoServices;
    this.assigneeService = assigneeService;
    this.assigneeRepository = assigneeRepository;
    this.todoRepository = todoRepository;
  }
  //  private TodoRepository todoRepository;
//  private AssigneeRepository assigneeRepository;

//  @Autowired
//  public TodoController(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
//    this.todoRepository = todoRepository;
//    this.assigneeRepository = assigneeRepository;
//  }

  @GetMapping(value = {"/", "list"})
  public String isActive(Model model, @RequestParam(value = "isActive", required = false) String active) {
    todoServices.active(active, model);
    return "todolist";
  }

  @GetMapping("/add")
  public String addTodo() {
    return "add";
  }

  @PostMapping("/addTodo")
  public String addTodo(Model model, @ModelAttribute(value = "todo") String todo) {
    todoServices.add(todo, model);
    return "redirect:/todo/";
  }

  @PostMapping("/remove")
  public String removeTodo(@ModelAttribute(value = "removetodo") Long id) {
    todoServices.deleteById(id);
    return "redirect:/todo/";
  }

//  @GetMapping("/{id}/update")
//  public String update() {
//    return "update";
//  }

  @GetMapping("/{id}/update")
  public String updatePage(@PathVariable(value = "id") Long id, Model model) {
    todoServices.update(id, model);
    model.addAttribute("assigneelist", assigneeService.findAll());
    return "update";
  }

//  @PostMapping("/{id}/update")
//  public String postUpdate(@ModelAttribute(value = "todo") Todo todo) {
//    todoServices.save(todo);
//    return "redirect:/todo/";

  @PostMapping("/{id}/update")
  public String postUpdate(@PathVariable(value = "id")Long id,
                           @ModelAttribute(value = "todo") Todo todo,
                           @ModelAttribute(value = "assignee") Assignee assignee) {
    assigneeService.addTodo(id,todo);
    return "redirect:/todo/";

  }

//  @PostMapping("/{id}/update")
//  public String postUpdate(@PathVariable(value = "id") Long id, @ModelAttribute(value = "title") String title,
//                           @RequestParam(value = "urgent", required = false) boolean urgent,
//                           @RequestParam(value = "done", required = false) boolean done) {
//    todoRepository.save(new Todo(id, title, urgent, done));
//    return "redirect:/todo/";
//  }

  @GetMapping("/search")
  public String findByTitle(Model model, @RequestParam(value = "title") String title) {
    todoServices.search(title, model);
    return "todolist";
  }
}