package com.example.bootmvc.thymeleaf.devtools.repositories;

import com.example.bootmvc.thymeleaf.devtools.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findByRole(String role);
}
