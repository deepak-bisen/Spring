package com.sp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sp.main.entity.User;
import com.sp.main.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/regPage")
	public String openRegPage(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}

	@PostMapping("/regForm")
	public String submitRegForm(@ModelAttribute("user") User user, Model model) {
		boolean status = userService.registerUser(user);
		if (status) {
			model.addAttribute("successMsg", "User Registerd Successfully.");
		} else {
			model.addAttribute("errorMsg", "User Registration Failed.");
		}

		return "register";
	}

	@GetMapping("/loginPage")
	public String openLogin() {
		return "login";
	}

	@PostMapping("/loginForm")
	public String submitLoginForm(@ModelAttribute("user") User user, Model model) {
		User validUser = userService.loginUser(user.getEmail(), user.getPassword());
		if (validUser != null) {
			model.addAttribute("modelName", validUser.getName());
			return "profile";
		} else {
			model.addAttribute("errorMsg", "Email or Password doesn't matched.");
			return "login";
		}
	}
}
