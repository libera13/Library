package com.example.bootmvc.thymeleaf.devtools.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.bootmvc.thymeleaf.devtools.entities.User;


@RepositoryRestResource(path = "Users")
public interface UserRepository extends JpaRepository<User, String> {
	 
}
