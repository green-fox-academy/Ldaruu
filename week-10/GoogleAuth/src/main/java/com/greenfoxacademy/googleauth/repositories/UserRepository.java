package com.greenfoxacademy.googleauth.repositories;

import com.greenfoxacademy.googleauth.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  User findByPrincipalId(String id);
}