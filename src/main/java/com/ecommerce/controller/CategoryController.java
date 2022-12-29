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

import com.ecommerce.dto.CategoryDTO;
import com.ecommerce.model.Category;
import com.ecommerce.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
		
		@Autowired
		CategoryService categoryService;
		
		@PostMapping(value="/create",consumes=MediaType.APPLICATION_JSON_VALUE)
		public CategoryDTO createCategory(@RequestBody CategoryDTO category) {
			 this.categoryService.createCategory(category);
			return category;		
		}
		@GetMapping("/categories")
		public List<CategoryDTO> getCategories() {
			return this.categoryService.getCategory();
		}
		@GetMapping("/categories/{categoryId}")
		public Category getCategoryByID(@PathVariable int categoryId) {
			return this.categoryService.getCategoryByID(categoryId);
		}
		
		@DeleteMapping(value="/categories/{categoryId}")
		public int deleteCategory(@PathVariable int categoryId) {
			 this.categoryService.deleteCategory(categoryId);
			 return categoryId;
			
			
		}
		@PutMapping("/categories")
		public CategoryDTO updateCategory(@RequestBody CategoryDTO category) {
			return this.categoryService.updateCategory(category);
		}

	}

