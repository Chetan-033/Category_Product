package com.Product_Category.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Products")
public class Product {
	
@Id	
 private int product_Id;
 private String product_name;
 private int product_Cost;
 private String product_Details;
 
 @ManyToOne
 @JoinColumn(name="category_Id")
 private Category category;

public Product() {
	super();
	// TODO Auto-generated constructor stub
}

public Product(int product_Id, String product_name, int product_Cost, String product_Details, Category category) {
	super();
	this.product_Id = product_Id;
	this.product_name = product_name;
	this.product_Cost = product_Cost;
	this.product_Details = product_Details;
	this.category = category;
}

public int getProduct_Id() {
	return product_Id;
}

public void setProduct_Id(int product_Id) {
	this.product_Id = product_Id;
}

public String getProduct_name() {
	return product_name;
}

public void setProduct_name(String product_name) {
	this.product_name = product_name;
}

public int getProduct_Cost() {
	return product_Cost;
}

public void setProduct_Cost(int product_Cost) {
	this.product_Cost = product_Cost;
}

public String getProduct_Details() {
	return product_Details;
}

public void setProduct_Details(String product_Details) {
	this.product_Details = product_Details;
}

@JsonBackReference
public Category getCategory() {
	return category;
}

public void setCategory(Category category) {
	this.category = category;
}
	

}
