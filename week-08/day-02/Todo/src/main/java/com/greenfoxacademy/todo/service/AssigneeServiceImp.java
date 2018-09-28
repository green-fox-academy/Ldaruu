package com.greenfoxacademy.todo.service;

import com.greenfoxacademy.todo.models.Assignee;
import com.greenfoxacademy.todo.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class AssigneeServiceImp implements AssigneeService {

  AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeServiceImp(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  @Override
  public List<Assignee> findAll() {
    return assigneeRepository.findAll();

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

  }
}
