package com.greenfoxacademy.authentication.services;

import com.greenfoxacademy.authentication.models.Client;
import com.greenfoxacademy.authentication.models.Role;
import com.greenfoxacademy.authentication.repositories.ClientRepository;
import com.greenfoxacademy.authentication.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ClientServiceImpl implements ClientService {

  private ClientRepository clientRepository;
  private RoleRepository roleRepository;
  private BCryptPasswordEncoder bCryptPasswordEncoder;

  @Autowired
  public ClientServiceImpl(ClientRepository clientRepository, RoleRepository roleRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
    this.clientRepository = clientRepository;
    this.roleRepository = roleRepository;
    this.bCryptPasswordEncoder = bCryptPasswordEncoder;
  }

  @Override
  public Client findByEmail(String email) {
    return clientRepository.findByEmail(email);
  }

  @Override
  public Client saveClient(Client client) {
    client.setPassword(bCryptPasswordEncoder.encode(client.getPassword()));
    client.setActive(1);
    Role clientRole = roleRepository.findByRole("ADMIN");
    client.setRoles(new HashSet<Role>(Arrays.asList(clientRole)));
    return clientRepository.save(client);

  }

  public List<Client> getClients() {
    return clientRepository.findAll();
  }

  @Override
  public Client getClientById(Long id) {
    return clientRepository.findById(id).orElse(null);
  }

  @Override
  public Client updateClient(Client client) {
    client.setPassword(bCryptPasswordEncoder.encode(client.getPassword()));
    client.setActive(1);
    return clientRepository.save(client);
  }
}
