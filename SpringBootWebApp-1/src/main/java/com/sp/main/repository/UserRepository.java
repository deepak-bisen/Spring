package com.sp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sp.main.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
