package com.Product_Category.Service;

import java.util.List;

import com.Product_Category.Entity.Category;

public interface Category_Service {

	public List<Category> getAllCategory(Integer page, Integer pageSize); 
	
	public Category getCategory(int cataegoryId); 

	public void deleteCategory(int cataegoryId); 

	public Category addCategory(Category category); 
	
}
