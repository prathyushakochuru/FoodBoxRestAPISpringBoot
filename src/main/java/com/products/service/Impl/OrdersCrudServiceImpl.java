package com.products.service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.model.Orders;
import com.products.repository.OrdersRepository;
import com.products.repository.UserRepository;
import com.products.service.OrdersCrudService;

@Service
public class OrdersCrudServiceImpl implements OrdersCrudService
{

	@Autowired
	private OrdersRepository ordersRepo;

	

	@Override
	public List<Orders> getOrdersbyUser(String username) {
		// TODO Auto-generated method stub
		return ordersRepo.findOrdersByusername(username);
	}



	@Override
	public Orders createOrder(Orders order) {
		// TODO Auto-generated method stub
		return ordersRepo.save(order);
	}

}
