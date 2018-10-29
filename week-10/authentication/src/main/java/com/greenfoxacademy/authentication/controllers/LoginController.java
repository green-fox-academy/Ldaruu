package com.greenfoxacademy.authentication.controllers;

import com.greenfoxacademy.authentication.models.Client;
import com.greenfoxacademy.authentication.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

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

  @GetMapping("/index")
  public String indexPage() {
    return "index";
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
  public ModelAndView createNewClient(@Valid Client client, BindingResult bindingResult) {
    ModelAndView modelAndView = new ModelAndView();
    Client clientExists = clientService.findByEmail(client.getEmail());
    if (clientExists != null) {
      bindingResult
          .rejectValue("email", "error.client",
              "There is already a client registered with the email provided");
    }
    if (bindingResult.hasErrors()) {
      modelAndView.setViewName("registration");
    } else {
      clientService.saveClient(client);
      modelAndView.addObject("successMessage", "Client has been registered successfully");
      modelAndView.addObject("client", new Client());
      modelAndView.setViewName("registration");
    }
    return modelAndView;
  }


  @RequestMapping(value="/admin/home", method = RequestMethod.GET)
  public ModelAndView home(Model model) {
    ModelAndView modelAndView = new ModelAndView();
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    Client client = clientService.findByEmail(authentication.getName());
    modelAndView.addObject("clietName", "Welcome " + client.getName() + " " + client.getLastName() + " (" + client.getEmail() + ")");
    modelAndView.addObject("adminMessage", "Content Available Only for Clients   with Admin Role");
    List<Client> clients = clientService.getClients();
    model.addAttribute("clients", clients);
    modelAndView.setViewName("/admin/home");
    return modelAndView;
  }

  @GetMapping("/access-denied")
  public ModelAndView denied() {
    ModelAndView modelAndView = new ModelAndView();
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    Client client = clientService.findByEmail(authentication.getName());
    modelAndView.addObject("client", "Dear " + client.getName() + " " + client.getLastName()
        + " unfortunately you have no rights to check this page!");
    modelAndView.setViewName("/access-denied");
    return modelAndView;
  }
}
