package com.example.bootmvc.thymeleaf.devtools.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.bootmvc.thymeleaf.devtools.entities.Item;

@RepositoryRestResource(path = "Iems")
public interface InventoryRepository extends JpaRepository<Item, Long>{
	public Item findById(long id);
}