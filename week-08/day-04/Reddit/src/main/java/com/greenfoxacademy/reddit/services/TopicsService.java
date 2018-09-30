package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.model.Topic;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TopicsService {

  List<Topic> getTopics();

  Topic addTopic(String title, String link);

  Topic getTopicById(Long id);

  void removeTopic(Long id);

  void saveTopic(Topic topic);

  void addLikes(Long id);

  void dissLike(Long id);

}
