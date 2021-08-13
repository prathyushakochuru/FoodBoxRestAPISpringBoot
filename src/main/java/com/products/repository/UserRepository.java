package com.products.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.products.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User findByusername(String username);

}
