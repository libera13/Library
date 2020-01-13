package com.example.bootmvc.thymeleaf.devtools.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.bootmvc.thymeleaf.devtools.entities.Item;
import com.example.bootmvc.thymeleaf.devtools.repositories.InventoryRepository;


@Transactional
@Service("itemService")
public class ItemServiceImpl implements ItemService{
	@Autowired
	private InventoryRepository ir;
	
	@Override
	public Item update(Item item) {
		return ir.save(item);
	};


}
