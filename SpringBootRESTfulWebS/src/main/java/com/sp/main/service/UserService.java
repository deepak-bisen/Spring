package com.sp.main.service;

import java.util.List;
import java.util.Optional;

import com.sp.main.entities.User;

public interface UserService {

	public User createUser(User user);
	
	public List<User> getAllUssers();
	
	public Optional<User> getUserDetails(int id);
}
