package com.greenfoxacademy.authentication.repositories;

import com.greenfoxacademy.authentication.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

  Role findByRole(String role);
}
