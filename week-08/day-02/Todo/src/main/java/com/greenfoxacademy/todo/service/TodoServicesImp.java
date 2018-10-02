package com.greenfoxacademy.todo.service;

import com.greenfoxacademy.todo.models.Assignee;
import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;


@Service
public class TodoServicesImp implements TodoServices {

  TodoRepository todoRepository;

  @Autowired
  public TodoServicesImp(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public List<Todo> findAll() {
    return todoRepository.findAll();
  }

  @Override
  public void save(Todo todo) {
    todoRepository.save(todo);

  }

  @Override
  public Todo findById(long id) {
    return todoRepository.findAllById(id);
  }


  @Override
  public void deleteById(long id) {
    todoRepository.deleteById(id);
  }

  public void active(String active, Model model) {
    if (active == null) {
      model.addAttribute("todolist", todoRepository.findAll());
    } else if (active == null || active.equals("false")) {
      model.addAttribute("todolist", todoRepository.findAllByDoneFalse());
    } else if (active == null || active.equals("true")) {
      model.addAttribute("todolist", todoRepository.findAllByDoneTrue());
    }
  }

  public void update(Long id, Model model) {
    model.addAttribute(todoRepository.findById(id).orElse(null));
  }

  public void search(String title, Model model) {
    if (title != null) {
      model.addAttribute("todolist", todoRepository.findByTitleContaining(title));
    }
  }
  public void add(String todo, Model model) {
    model.addAttribute("addtodo", todoRepository.save(new Todo(todo)));
  }

  @Override
  public Todo addAssignee(Assignee assignee, Long id) {
    Todo todo= todoRepository.findById(id).get();
    todo.setAssignee(assignee);
    return todo;
  }
}
