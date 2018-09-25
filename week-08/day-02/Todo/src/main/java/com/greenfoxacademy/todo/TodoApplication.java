package com.greenfoxacademy.todo;

import com.greenfoxacademy.todo.models.Todo;
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

  @Autowired

  public TodoApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Feed the dog!"));
    todoRepository.save(new Todo("Clean my room!"));
    todoRepository.save(new Todo("Buy Milk!"));

  }
}
