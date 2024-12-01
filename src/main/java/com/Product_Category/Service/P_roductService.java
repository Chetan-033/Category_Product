package com.Product_Category.Service;

import java.util.List;

import com.Product_Category.Entity.Product;

public interface P_roductService {

	public List<Product> getAllProduct(Integer page, Integer pageSize);

	public Product getProduct(int productId);

	public void deleteProduct(int productId);

	public Product addProduct(Product product);

}
