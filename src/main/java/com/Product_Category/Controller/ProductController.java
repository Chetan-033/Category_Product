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
import com.Product_Category.Entity.Product;
import com.Product_Category.Service.P_roductService;


@RestController
public class ProductController {

	@Autowired
	private P_roductService ProductService;
	
	@GetMapping("/products")
	public List<Product> getAllProduct(@RequestParam(value="page",defaultValue="1",required=false
	)Integer page,@RequestParam(value="pageSize",defaultValue="1",required=false)Integer pageSize){
		
		
		return this.ProductService.getAllProduct(page,pageSize);
	}
	
	@GetMapping("/products/{productId}")
	public Product getProduct(@PathVariable int productId) {
		
		return this.ProductService.getProduct(productId);
		
		}
	
	@DeleteMapping ("/products/{productId}")
	public void deleteProduct(@PathVariable int productId) {
		
		this.ProductService.deleteProduct(productId);
	}
	
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product Product) {
		
		return this.ProductService.addProduct(Product);
	}
	
	@PutMapping("/products")
	public Product updateProduct(@RequestBody Product Product) {
		
		return this.ProductService.addProduct(Product);
	}
}
