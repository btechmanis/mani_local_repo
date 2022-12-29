package com.ecommerce.service;

import java.util.List;

import com.ecommerce.dto.CategoryDTO;
import com.ecommerce.model.Category;



public interface CategoryService {

	
	public CategoryDTO createCategory(CategoryDTO category);
	public List<CategoryDTO> getCategory();

	
   public CategoryDTO updateCategory(CategoryDTO category);
	public Category getCategoryByID(int categoryId);
	
	void deleteCategory(int categoryId);
	
	
}
