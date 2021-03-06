package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.model.Topic;
import com.greenfoxacademy.reddit.services.TopicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class RedditController {

  TopicsService topicsService;

  @Autowired
  public RedditController(TopicsService topicsService) {
    this.topicsService = topicsService;
  }

  @GetMapping("/")
  public String showAllTopics(Model model) {
    List<Topic> topics = topicsService.getTopics();
    model.addAttribute("topics", topics);
    return "reddit";
  }

  @GetMapping("/submit")
  public String submitPage() {
    return "submit";
  }

  @PostMapping("/submit")
  public String submitTopic(@ModelAttribute(value = "title") String title, @ModelAttribute(value = "link") String link) {
    topicsService.addTopic(title, link);
    return "redirect:/";
  }

  @GetMapping("addlike/{id}")
  public String addLike(@PathVariable(value = "id") Long id) {
    topicsService.addLikes(id);
    return "redirect:/";
  }

  @GetMapping("disslike/{id}")
  public String disslike(@PathVariable(value = "id") Long id) {
    topicsService.dissLike(id);
    return "redirect:/";
  }

  @PostMapping("/remove/{id}")
  public String removeTopic(@ModelAttribute(value = "removetopic") Long id) {
    topicsService.removeTopic(id);
    return "redirect:/";
  }


}
