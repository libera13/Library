package com.example.bootmvc.thymeleaf.devtools.controllers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bootmvc.thymeleaf.devtools.entities.Item;
import com.example.bootmvc.thymeleaf.devtools.repositories.InventoryRepository;
import com.example.bootmvc.thymeleaf.devtools.services.ItemServiceImpl;


@Controller
@RequestMapping("/produkty")
public class ShowListController {
	@Autowired
	protected InventoryRepository IR;
	@Autowired
	protected ItemServiceImpl itemServiceImpl;
	
	
	@GetMapping("/lista")
	public String produktyList(Model model) {
		model.addAttribute("ItemListAttr", IR.findAll());
		return "listPage";
	}

	@GetMapping("/usun/{id}")
	public String deleteItem(@PathVariable("id") long id, Model model) {
		Item item = IR.findById(id);
		IR.delete(item);
		model.addAttribute("ItemListAttr", IR.findAll());
		return "listPage";
	}
	@GetMapping("/edytuj/{id}")
	public String editItem(@PathVariable("id") long id, Model model) {
		Item item = IR.findById(id);
		model.addAttribute("item", item);
		return "updateItem";
	}
	@PostMapping("/update/{id}")
	public String updateItem(@PathVariable("id") long id, @Valid Item item, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "updateItem";
		    }
		else {
			itemServiceImpl.update(item);
		    return "redirect:/produkty/lista";
		}
	}
	
	
}
