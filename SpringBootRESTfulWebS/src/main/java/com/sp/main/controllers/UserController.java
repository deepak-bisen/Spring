package com.sp.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sp.main.entities.User;
import com.sp.main.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/user")
	public User addUserDetails(@RequestBody User user) {
		return userService.createUser(user);
	}

	@GetMapping("/user")
	public List<User> getAllUserDetails() {
		return userService.getAllUssers();
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserDetailsById(@PathVariable int id) {
		User user = userService.getUserDetails(id).orElse(null);
		if (user != null) {
			return ResponseEntity.ok().body(user);
		} else {
			return ResponseEntity.notFound().build();
		}

	}
}
