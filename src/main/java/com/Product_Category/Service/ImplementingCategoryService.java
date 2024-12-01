package com.Product_Category.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.Product_Category.Entity.Category;
import com.Product_Category.Repository.Category_Repository;


@Service
public class ImplementingCategoryService implements Category_Service {
	
	@Autowired
	private Category_Repository categoryRepository ; 
	
	//get all record with pagination
	@Override
	public List<Category> getAllCategory(Integer page, Integer pageSize) {
		
		Pageable pageable =PageRequest.of(page, pageSize);
		Page<Category> pageCategory=categoryRepository.findAll(pageable);
		
		return pageCategory.toList();
	}

	@Override
	public Category getCategory(int cataegoryId) {
		
		return categoryRepository.findById(cataegoryId).get();
	}

	@Override
	public void deleteCategory(int cataegoryId) {

		Category category=categoryRepository.findById(cataegoryId).get();
		categoryRepository.delete(category);
		
	}

	@Override
	public Category addCategory(Category category) {
		
		return categoryRepository.save(category);
	}

}
