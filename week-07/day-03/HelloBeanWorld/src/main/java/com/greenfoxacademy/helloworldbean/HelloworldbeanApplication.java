package com.greenfoxacademy.helloworldbean;

import com.greenfoxacademy.helloworldbean.services.PrintInRed;
import com.greenfoxacademy.helloworldbean.services.Printer;
import com.greenfoxacademy.helloworldbean.services.PrintingInBlue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldbeanApplication implements CommandLineRunner {

  Printer printer;
  PrintingInBlue blue;
  PrintInRed red;


  @Autowired
  public HelloworldbeanApplication(Printer printer, PrintInRed red, PrintingInBlue blue) {
    this.printer = printer;
    this.red = red;
    this.blue = blue;
  }

  public static void main(String[] args) {
    SpringApplication.run(HelloworldbeanApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    blue.printColor();
    red.printColor();

  }
}
