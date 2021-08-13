package com.products.service;
import java.util.List;

import com.products.model.User;

public interface UserCrudService {
	
	public User createUser(User user);
	public User getUser(String username);

}
