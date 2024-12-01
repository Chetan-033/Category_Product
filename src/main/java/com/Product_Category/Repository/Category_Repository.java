package com.Product_Category.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Product_Category.Entity.Category;



@Repository
public interface Category_Repository extends JpaRepository<Category,Integer>{
	
	

}