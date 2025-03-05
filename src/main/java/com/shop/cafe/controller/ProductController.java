package com.shop.cafe.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.shop.cafe.dto.Product;
import com.shop.cafe.service.ProductService;

@RestController
@CrossOrigin("http://127.0.0.1:5501")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	@GetMapping("getAllProducts")
	public List<Product> getAllProducts(){
		try {
			System.out.println("getAllProducts 실행됨 ~!");
			return productService.getAllProducts();
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

}
