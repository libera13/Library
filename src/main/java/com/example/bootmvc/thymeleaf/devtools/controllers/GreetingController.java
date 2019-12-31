package com.example.bootmvc.thymeleaf.devtools.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bootmvc.thymeleaf.devtools.entities.Item;

@Controller
public class GreetingController {
	@GetMapping("/witam")
	public String greetingForm(Model model) {
		model.addAttribute("ModelAtributeName", new Item());
		return "greeting";
	}
	@PostMapping("/witam")
	public String greetingSubmit(@ModelAttribute Item item) {
		return "result";
	}

}
