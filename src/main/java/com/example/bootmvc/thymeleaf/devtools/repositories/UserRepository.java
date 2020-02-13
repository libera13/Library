package com.example.bootmvc.thymeleaf.devtools.repositories;

import com.example.bootmvc.thymeleaf.devtools.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByEmail(String email);
}
