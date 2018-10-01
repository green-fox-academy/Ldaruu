package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.model.Topic;
import com.greenfoxacademy.reddit.services.TopicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedditRestController {

  private TopicsService topicsService;

  @Autowired
  public RedditRestController(TopicsService topicsService) {
    this.topicsService = topicsService;
  }

  @PostMapping("api/submit")
  public Topic submitPost(@RequestBody Topic topic) {
    Topic newTopic = topicsService.createTopics(topic);
    return  newTopic;
  }
}
