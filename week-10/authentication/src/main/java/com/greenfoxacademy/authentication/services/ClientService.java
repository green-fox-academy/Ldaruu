package com.greenfoxacademy.authentication.services;

import com.greenfoxacademy.authentication.models.Client;
import org.springframework.stereotype.Service;

@Service
public interface ClientService {

  public Client findByEmail(String email);

  public void saveClient(Client client);
}
