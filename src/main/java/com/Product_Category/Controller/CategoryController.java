package com.Product_Category.Controller;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Product_Category.Entity.Category;
import com.Product_Category.Service.Category_Service;

@RestController
public class CategoryController {
	
	@Autowired
	private Category_Service categoryService;
	
	@GetMapping("/categories")
	public List<Category> getAllCategory(@RequestParam(value="page",defaultValue="1",required=false
	)Integer page,@RequestParam(value="pageSize",defaultValue="1",required=false)Integer pageSize){
		
		
		return this.categoryService.getAllCategory(page,pageSize);
	}
	
	@GetMapping("/categories/{CataegoryId}")
	public Category getCategory(@PathVariable int CataegoryId) {
		
		return this.categoryService.getCategory(CataegoryId);
		
		}
	
	@DeleteMapping ("/categories/{CataegoryId}")
	public void deleteCategory(@PathVariable int CataegoryId) {
		
		this.categoryService.deleteCategory(CataegoryId);
	}
	
	@PostMapping("/categories")
	public Category addCategory(@RequestBody Category category) {
		
		return this.categoryService.addCategory(category);
	}
	
	@PutMapping("/categories")
	public Category updateCategory(@RequestBody Category category) {
		
		return this.categoryService.addCategory(category);
	}
	

}
