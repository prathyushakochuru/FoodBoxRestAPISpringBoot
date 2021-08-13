package com.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.products.model.Products;
import com.products.model.User;
import com.products.service.ProductsCrudService;
import com.products.service.UserCrudService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="FoodBoxAPI", description="This is a FoodBox API, you can login using admin credentials - manage & categorize the products, browse list of all users & search by name/contact and view purchase lists by date and category")
@RequestMapping("/foodboxapi")

public class UserCrudController {
	
	@Autowired
	private UserCrudService userService;
	
	@ApiOperation("User can register by providing the user details")
	@CrossOrigin(origins = "*")
	@PostMapping(value = "/user")
	
	public String createuser(@RequestBody User user) 
	{
		userService.createUser(user);
		return "Created user and saved to mysql-FoodBox DB - " + user.toString();
		
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping(value = "/user/{username}")
	public User getProductByName(@PathVariable(value = "username")String username)
	{
		return userService.getUser(username);
	}

}
