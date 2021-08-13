package com.products.repository;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.products.model.Products;
//import com.products.model.Users;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer>{
	
	public List<Products> findByProductname(String productname);
	
	//public List<Products> findByOrderByPriceDesc(String productname, Direction desc);
	
	//public List<Products> findByOrderByPriceAsc(String productname, Direction asc);

	//public List<Products> findByOrderByCategory(String productname);

	
}
