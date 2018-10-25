package com.greenfoxacademy.authentication.repositories;

import com.greenfoxacademy.authentication.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

  Client findByEmail(String email);
}
