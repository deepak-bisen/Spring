package com.sp.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.main.entities.User;
import com.sp.main.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository repository;

	@Override
	public User createUser(User user) {

		return repository.save(user);
	}

	@Override
	public List<User> getAllUssers() {
		return repository.findAll();
	}

	@Override
	public Optional<User> getUserDetails(int id) {
		return repository.findById(id);
	}
}
