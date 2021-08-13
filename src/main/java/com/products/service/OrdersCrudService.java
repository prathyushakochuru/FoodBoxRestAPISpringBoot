package com.products.service;

import java.util.List;

import com.products.model.Orders;


public interface OrdersCrudService {
	
	public Orders createOrder(Orders order);
	public List<Orders> getOrdersbyUser(String username);

}
