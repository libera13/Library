package com.example.bootmvc.thymeleaf.devtools.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bootmvc.thymeleaf.devtools.entities.Item;
import com.example.bootmvc.thymeleaf.devtools.services.ItemServiceImpl;

@Controller
public class GreetingController {
	@Autowired
	ItemServiceImpl itemServiceImpl;
	
	@GetMapping("/dodaj")
	public String greetingForm(Model model) {
		model.addAttribute("item", new Item());
		return "addItem";
	}
	@PostMapping("/dodaj")
	public String greetingSubmit(@ModelAttribute @Valid Item item, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
		      return "addItem";
		    }
		else {
			itemServiceImpl.update(item);
		    return "result";
		}
	}

}
