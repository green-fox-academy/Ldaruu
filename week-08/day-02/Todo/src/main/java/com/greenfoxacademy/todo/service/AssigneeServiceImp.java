package com.greenfoxacademy.todo.service;

import com.greenfoxacademy.todo.models.Assignee;
import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.repository.AssigneeRepository;
import com.greenfoxacademy.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AssigneeServiceImp implements AssigneeService {

  AssigneeRepository assigneeRepository;
  TodoRepository todoRepository;

  @Autowired
  public AssigneeServiceImp(AssigneeRepository assigneeRepository, TodoRepository todoRepository) {
    this.assigneeRepository = assigneeRepository;
    this.todoRepository = todoRepository;
  }

  @Override
  public List<Assignee> findAll() {
    return assigneeRepository.findAll();

  }

  @Override
  public List<Assignee> findAllByid(Long id) {
    return assigneeRepository.findAllById(id);
  }

  @Override
  public void addNewAssignee(String name, String email) {
    assigneeRepository.save(new Assignee(name, email));
  }

  @Override
  public void removeAssigne(long id) {
    assigneeRepository.deleteById(id);

  }

  @Override
  public void editAssigne(long id) {

  }

  @Override
  public void saveAssigne(Assignee assignee) {
    assigneeRepository.save(assignee);

  }

  @Override
  public void update(Long id, Model model) {
    model.addAttribute(assigneeRepository.findById(id).orElse(null));
  }

  @Override
  public Assignee findById(Long id) {
    return assigneeRepository.findById(id).get();
  }

//  @Override
//  @Transactional
//  public void addTodo(Long id, Todo todo) {
//    Assignee assignee = assigneeRepository.findById(id).get();
//    assignee.addTodo(todo);
//    assigneeRepository.save(assignee);
//
//  }


}
