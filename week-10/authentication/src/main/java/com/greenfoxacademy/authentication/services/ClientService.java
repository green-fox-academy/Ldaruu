package com.greenfoxacademy.authentication.services;

import com.greenfoxacademy.authentication.models.Client;
import com.greenfoxacademy.authentication.models.Role;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface ClientService {

  public Client findByEmail(String email);

  public Client saveClient(Client client);

  public List<Client> getClients();

  public Client getClientById(Long id);

  public Client updateClient(Client client);

}
