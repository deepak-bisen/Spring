package com.sp.main.service;

import com.sp.main.entity.User;

public interface UserService {

	public boolean registerUser(User user);

	public User loginUser(String email, String password);
}
