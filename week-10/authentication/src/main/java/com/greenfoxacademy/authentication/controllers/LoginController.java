package com.greenfoxacademy.authentication.controllers;

import com.greenfoxacademy.authentication.models.Client;
import com.greenfoxacademy.authentication.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class LoginController {

  private ClientService clientService;

  @Autowired
  public LoginController(ClientService clientService) {
    this.clientService = clientService;
  }

  @GetMapping(value = {"/", "/login"})
  public ModelAndView login() {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("login");
    return modelAndView;
  }

  @GetMapping("/registration")
  public ModelAndView registration() {
    ModelAndView modelAndView = new ModelAndView();
    Client client = new Client();
    modelAndView.addObject("client", client);
    modelAndView.setViewName("registration");
    return modelAndView;
  }

  @PostMapping("/registration")
  public ModelAndView createNewUser(@Valid Client client, BindingResult bindingResult) {
    ModelAndView modelAndView = new ModelAndView();
    Client clientExists = clientService.findByEmail(client.getEmail());
    if (client != null) {
      bindingResult
          .rejectValue("email", "error.user",
              "There is already a user registered with the email provided");
    }
    if (bindingResult.hasErrors()) {
      modelAndView.setViewName("registration");
    } else {
      clientService.saveClient(client);
      modelAndView.addObject("successMessage", "User has been registered successfully");
      modelAndView.addObject("user", new Client());
      modelAndView.setViewName("registration");

    }
    return modelAndView;
  }

  @GetMapping("/admin/home")
  public ModelAndView home() {
    ModelAndView modelAndView = new ModelAndView();
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    Client client = clientService.findByEmail(authentication.getName());
    modelAndView.addObject("clietName", "Welcome " + client.getName() + " " + client.getLastName() + " (" + client.getEmail() + ")");
    modelAndView.addObject("adminMessage", "Content Available Only for Users with Admin Role");
    modelAndView.setViewName("admin/home");
    return modelAndView;
  }

}
