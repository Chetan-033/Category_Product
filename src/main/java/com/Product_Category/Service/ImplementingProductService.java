package com.Product_Category.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.Product_Category.Entity.Category;
import com.Product_Category.Entity.Product;
import com.Product_Category.Repository.P_roductRepository;

@Service
public class ImplementingProductService implements P_roductService {
	
	@Autowired
	private P_roductRepository Product_Repository;

	@Override
	public List<Product> getAllProduct(Integer page, Integer pageSize) {
		Pageable pageable =PageRequest.of(page, pageSize);
		Page<Product> pageProduct=Product_Repository.findAll(pageable);
		
		return pageProduct.toList();
	}

	@Override
	public Product getProduct(int productId) {
		
		return Product_Repository.findById(productId).get();
	}

	@Override
	public void deleteProduct(int productId) {
		
		Product product=Product_Repository.findById(productId).get();
		Product_Repository.delete(product);
		
	}

	@Override
	public Product addProduct(Product product) {
		
		return Product_Repository.save(product);
	}

}
