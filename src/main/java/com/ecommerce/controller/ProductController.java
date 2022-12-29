package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.dto.ProductDTO;

import com.ecommerce.service.ProductService;

@RestController
	@RequestMapping("/product")
	public class ProductController {
	
		@Autowired
		ProductService productService;
		
		@PostMapping(value="/create",consumes=MediaType.APPLICATION_JSON_VALUE)
		public int createProduct(@RequestBody ProductDTO product) {
			 return this.productService.createProduct(product);	
		}
		@GetMapping("/products")
		public List<ProductDTO> getProduct() {
			return this.productService.getProduct();
		}

		
		@DeleteMapping("/products/{productId}")
		public void deleteProduct(@PathVariable int productId) {
			this.productService.deleteProduct(productId);
			
		}
		@PutMapping(value="/products",consumes=MediaType.APPLICATION_JSON_VALUE)
		public int updateProduct(@RequestBody  ProductDTO product) {
			 return this.productService.updateProduct(product);
		}
		
		@GetMapping("/products/{productId}")
		public ProductDTO getCategoryBYID(@PathVariable int productId) {
			return this.productService.getProductByID(productId);
		}
		
	}

