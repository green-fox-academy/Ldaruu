package com.greenfoxacademy.todo.controller;

import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("todo")
public class TodoController {

  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

//  @GetMapping(value = {"/", "list"})
//  public String list(Model model) {
//    model.addAttribute("todolist", todoRepository.findAll());
//    return "todolist";
//
//  }

  @GetMapping(value = {"/", "list"})
  public String isActive(Model model, @RequestParam(value = "isActive", required = false) String active) {
    if (active==null){
      model.addAttribute("todolist", todoRepository.findAll());
    }
    else if (active == null || active.equals("false")) {
      model.addAttribute("todolist", todoRepository.findAllByDoneFalse());
    } else if (active == null || active.equals("true")) {
      model.addAttribute("todolist", todoRepository.findAllByDoneTrue());
    }
    return "todolist";
  }
}