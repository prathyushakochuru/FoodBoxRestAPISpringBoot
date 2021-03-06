package com.products.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.products.model.Orders;



public interface OrdersRepository extends JpaRepository<Orders, Integer>{
	
	public List<Orders> findOrdersByusername(String username);

}
