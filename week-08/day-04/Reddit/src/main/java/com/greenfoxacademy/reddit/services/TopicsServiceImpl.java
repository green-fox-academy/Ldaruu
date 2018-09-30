package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.model.Topic;
import com.greenfoxacademy.reddit.repositories.TopicsReposiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicsServiceImpl implements TopicsService {

  TopicsReposiroty topicsReposiroty;

  @Autowired
  public TopicsServiceImpl(TopicsReposiroty topicsReposiroty) {
    this.topicsReposiroty = topicsReposiroty;
  }

  @Override
  public List<Topic> getTopics() {
    return topicsReposiroty.findAll();
  }

  @Override
  public Topic addTopic(String title, String link) {
    Topic topic = new Topic(title, link);
    topicsReposiroty.save(topic);
    return null;
  }

  @Override
  public Topic getTopicById(Long id) {
    return topicsReposiroty.findById(id).orElse(null);
  }

  @Override
  public void removeTopic(Long id) {
    topicsReposiroty.deleteById(id);
  }

  @Override
  public void saveTopic(Topic topic) {
    topicsReposiroty.save(topic);

  }

  @Override
  public void addLikes(Long id) {
    topicsReposiroty.findById(id).get().setLikes(topicsReposiroty.findById(id).get().getLikes() + 1);
    topicsReposiroty.save(topicsReposiroty.findById(id).get());
  }

  @Override
  public void dissLike(Long id) {
    if (topicsReposiroty.findById(id).get().getLikes()!=0) {
      topicsReposiroty.findById(id).get().setLikes(topicsReposiroty.findById(id).get().getLikes() - 1);
    }else {
      topicsReposiroty.findById(id).get().setLikes(0);
    }
    topicsReposiroty.save(topicsReposiroty.findById(id).get());
  }
}
