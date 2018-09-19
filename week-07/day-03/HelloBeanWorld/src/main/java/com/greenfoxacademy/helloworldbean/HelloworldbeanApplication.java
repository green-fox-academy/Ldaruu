package com.greenfoxacademy.helloworldbean;

import com.greenfoxacademy.helloworldbean.services.MyColor;
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
  MyColor redPrint;
  MyColor bluePrint;
//  PrintInRed red;


  @Autowired
  public HelloworldbeanApplication(Printer printer, MyColor redPrint, MyColor bluePrint) {
    this.printer = printer;
    this.redPrint = redPrint;
    this.bluePrint = bluePrint;
  }

  public static void main(String[] args) {
    SpringApplication.run(HelloworldbeanApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    bluePrint.printColor();
    redPrint.printColor();

  }
}
