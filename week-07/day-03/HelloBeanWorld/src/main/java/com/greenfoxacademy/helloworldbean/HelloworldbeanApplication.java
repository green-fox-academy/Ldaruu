package com.greenfoxacademy.helloworldbean;

import com.greenfoxacademy.helloworldbean.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldbeanApplication implements CommandLineRunner {

  Printer printer;

  @Autowired
  public HelloworldbeanApplication(Printer printer) {
    this.printer=printer;

  }

  public static void main(String[] args) {
    SpringApplication.run(HelloworldbeanApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");

  }
}
