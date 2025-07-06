package com.sp.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.main.entity.User;
import com.sp.main.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository repository;

	@Override
	public boolean registerUser(User user) {
		try {

			repository.save(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public User loginUser(String email, String password) {
	    if (email == null || password == null) {
	        // bad input from form
	        return null;
	    }

	    User validUser = repository.findByEmail(email);

	    if (validUser != null && validUser.getPassword() != null && validUser.getPassword().equals(password)) {
	        return validUser;
	    }

	    return null;
	}

}
