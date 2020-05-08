package com.inthika.application.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inthika.application.model.User;
import com.inthika.application.repository.UserRepository;

@Controller
@RequestMapping("")
public class UserController {
	@Autowired
	UserRepository userrepo;

	@GetMapping("")
	public String showform(User user) {
		return "home";
		
	}
		@PostMapping("/update")
		public String addForm(@Valid User user, BindingResult result,Model model) {
			if (result.hasErrors()) {
				return "home";
			
			}
			userrepo.save(user);
			String success_message="Registration suceeded.";
			model.addAttribute("message", success_message);
			return "index";
	}
		
}
	