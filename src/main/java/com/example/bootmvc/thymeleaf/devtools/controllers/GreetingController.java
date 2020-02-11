package com.example.bootmvc.thymeleaf.devtools.controllers;

import javax.validation.Valid;

import com.example.bootmvc.thymeleaf.devtools.entities.User;
import com.example.bootmvc.thymeleaf.devtools.services.UserService;
import com.example.bootmvc.thymeleaf.devtools.utilities.AppUtils;
import com.example.bootmvc.thymeleaf.devtools.validators.UserRegisterValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.example.bootmvc.thymeleaf.devtools.entities.Item;
import com.example.bootmvc.thymeleaf.devtools.services.ItemServiceImpl;
import org.springframework.web.context.request.WebRequest;

import java.util.Locale;

@Controller
public class GreetingController {
	@Autowired
	ItemServiceImpl itemServiceImpl;
	@Autowired
	UserService userService;

	@GetMapping(value = {"/index","/"})
	public String showIndex(){
		return "index";
	}

	@GetMapping("/register")
	public String showRegisterForm(Model model) {
		User u = new User();
		model.addAttribute("user", u);
		return "register";
	}

	@PostMapping("/register")
	public String sendRegisterForm(User user, BindingResult result, Model model, Locale locale) {

		String returnPage = null;

		User userExist = userService.findUserByEmail(user.getEmail());

		new UserRegisterValidator().validateEmailExist(userExist, result);

		new UserRegisterValidator().validate(user, result);

		if (result.hasErrors()) {
			returnPage = "register";
		} else {
//			user.setActivationCode(AppUtils.randomStringGenerator());
//
//			String content = "Wymagane potwierdzenie rejestracji. Kliknij w poniższy link aby aktywować konto: " +
//					"http://localhost:8080/activatelink/" + user.getActivationCode();

			userService.saveUser(user);
//			emailSender.sendEmail(user.getEmail(), "Potwierdzenie rejestracji", content);
//			model.addAttribute("message", messageSource.getMessage("user.register.success.email", null, locale));
//			//model.addAttribute("user", new User());
			returnPage = "index";
		}

		return returnPage;
	}

	@GetMapping("/login")
	public String showLoginPage(){
		return "login";
	}

	// Login form with error
	@RequestMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		return "login";
	}


}
