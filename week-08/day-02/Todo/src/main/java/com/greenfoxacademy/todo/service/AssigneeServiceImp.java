package com.greenfoxacademy.todo.service;

import com.greenfoxacademy.todo.repository.AssigneeRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class AssigneeServiceImp implements AssigneeService {

  AssigneeRepository assigneeRepository;

  public AssigneeServiceImp(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  @Override
  public void findAllBy(Model model) {
    model.addAttribute("assigneelist", assigneeRepository.findAllBy());

  }
}
