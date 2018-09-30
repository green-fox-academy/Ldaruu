package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.model.Topic;
import com.greenfoxacademy.reddit.services.TopicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RedditController {

  TopicsService topicsService;

  @Autowired
  public RedditController(TopicsService topicsService) {
    this.topicsService = topicsService;
  }
  @GetMapping("/")
  public String showAllTopics(Model model){
    List<Topic> topics= topicsService.getTopics();
    model.addAttribute("topics",topics);
    return "reddit";
  }

}
