package com.example.bootmvc.thymeleaf.devtools.controllers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.example.bootmvc.thymeleaf.devtools.entities.Item;
import com.example.bootmvc.thymeleaf.devtools.repositories.InventoryRepository;
import com.example.bootmvc.thymeleaf.devtools.services.ItemServiceImpl;


@Controller
@RequestMapping("/books")
public class ShowListController {
	@Autowired
	protected InventoryRepository IR;
	@Autowired
	protected ItemServiceImpl itemServiceImpl;

	@GetMapping("/add")
	public String addBookForm(Model model) {
		model.addAttribute("item", new Item());
		return "addItem";
	}
	@PostMapping("/add")
	public String addBookFormSubmit(@ModelAttribute @Valid Item item, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "addItem";
		}
		else {
			itemServiceImpl.update(item);
			return "result";
		}
	}

	@GetMapping("/list")
	public String showList(Model model) {
		model.addAttribute("ItemListAttr", IR.findAll());
		return "listPage";
	}

	@GetMapping("/delete/{id}")
	public String deleteItem(@PathVariable("id") long id, Model model) {
		Item item = IR.findById(id);
		IR.delete(item);
		model.addAttribute("ItemListAttr", IR.findAll());
		return "listPage";
	}
	@GetMapping("/edit/{id}")
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
		    return "redirect:/books/list";
		}
	}
	
	
}
