package com.products.service.Impl;

import java.util.List;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.model.User;
import com.products.repository.UserRepository;
import com.products.service.UserCrudService;

@Service
public class UserCrudServiceImpl implements UserCrudService{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public User createUser(User user) {
	
		return userRepo.save(user);
	}

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return userRepo.findByusername(username);
	}

	

	

	

}
