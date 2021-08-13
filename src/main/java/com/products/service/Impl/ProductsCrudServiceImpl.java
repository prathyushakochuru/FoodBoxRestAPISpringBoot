package com.products.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;

import com.products.model.Products;
import com.products.repository.ProductRepository;
import com.products.service.ProductsCrudService;

@Service
public class ProductsCrudServiceImpl implements ProductsCrudService{

	@Autowired
	private ProductRepository productRepo;
	
	@Override
	public Products createProduct(Products product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

	@Override
	public Products updateProduct(int id, Products product) {
		
			Products existingprod = productRepo.findById(id).get();
			
			existingprod.setProductname(product.getProductname());
			existingprod.setPrice(product.getPrice());
		
		return productRepo.save(existingprod);
	}

	@Override
	public List<Products> getProductByName(String productname) {
		// TODO Auto-generated method stub
		return productRepo.findByProductname(productname);
	}

	@Override
	public void deleteProductById(int id) {
		productRepo.deleteById(id);
		
	}

	@Override
	public List<Products> getAllProducts() {
		
		return productRepo.findAll();
	}

	/*@Override
	public List<Products> getProductsOrderByAsc(String productname) {
		
		return productRepo.findByOrderByPriceAsc(productname, Sort.Direction.ASC);
	}

	@Override
	public List<Products> getProductsOrderByDesc(String productname) {
		
		return productRepo.findByOrderByPriceDesc(productname, Sort.Direction.DESC);
	}*/

	
}
