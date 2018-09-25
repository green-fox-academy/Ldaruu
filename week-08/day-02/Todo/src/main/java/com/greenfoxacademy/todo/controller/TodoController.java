package com.greenfoxacademy.todo.controller;

import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("todo")
public class TodoController {

  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping(value = {"/", "list"})
  public String isActive(Model model, @RequestParam(value = "isActive", required = false) String active) {
    if (active == null) {
      model.addAttribute("todolist", todoRepository.findAll());
    } else if (active == null || active.equals("false")) {
      model.addAttribute("todolist", todoRepository.findAllByDoneFalse());
    } else if (active == null || active.equals("true")) {
      model.addAttribute("todolist", todoRepository.findAllByDoneTrue());
    }
    return "todolist";
  }

  @GetMapping("/add")
  public String addTodo() {
    return "add";
  }

  @PostMapping("/addTodo")
  public String addTodo(Model model, @ModelAttribute(value = "todo") String todo) {
    model.addAttribute("addtodo", todoRepository.save(new Todo(todo)));
    return "redirect:/todo/";
  }

  @PostMapping("/remove")
  public String removeTodo(@ModelAttribute(value = "removetodo") Long id) {
    todoRepository.deleteById(id);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/update")
  public String Update() {
    return "update";
  }

  @PostMapping("/{id}/update")
  public String postUpdate(@ModelAttribute(value = "id") Long id, @ModelAttribute(value = "title") String title,
                           @RequestParam(value = "urgent", required = false) boolean urgent,
                           @RequestParam(value = "done",required = false) boolean done) {
    todoRepository.save(new Todo(id, title, urgent, done));
    return "redirect:/todo/";
  }
}