package com.greenfoxacademy.todo;

import com.greenfoxacademy.todo.models.Assignee;
import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.repository.AssigneeRepository;
import com.greenfoxacademy.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(TodoApplication.class, args);
  }

  TodoRepository todoRepository;
  AssigneeRepository assigneeRepository;

  @Autowired
  public TodoApplication(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
    this.todoRepository = todoRepository;
    this.assigneeRepository = assigneeRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    assigneeRepository.save(new Assignee("Laz","laz@home.com"));
    assigneeRepository.save(new Assignee("Adam","adam@greenfox.com"));
    assigneeRepository.save(new Assignee("Bob","bob@bobby.com"));
    assigneeRepository.save(new Assignee("Osame","saddam@hussain.hang"));
    todoRepository.save(new Todo("Feed the dog!", false, true));
    todoRepository.save(new Todo("Clean my room!", false, false));
    todoRepository.save(new Todo("Buy Milk!", true, true));
    todoRepository.save(new Todo("Learn JAVA", true, false));
    todoRepository.save(new Todo("Do homework", true, false));

  }
}
