package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dto.CategoryDTO;
import com.ecommerce.model.Category;
import com.ecommerce.repository.CategoryRepository;

@Service
public class CategoryServiceImpl  implements CategoryService {
	
	@Autowired
	private CategoryRepository categoryrepository;
	

	@Override
	public CategoryDTO createCategory(CategoryDTO categoryDto) {
		Category category=new Category();
		category.setCategoryName(categoryDto.getCategoryName());
		category.setCategoryDescription(categoryDto.getCategoryDescription());
		
		 category = categoryrepository.save(category);
		 categoryDto.setCategoryId(category.getCategoryId());
		 return categoryDto;
		
	}
     @Override
	public void  deleteCategory( int categoryId) {
		
    	 categoryrepository.deleteById(categoryId);
		
		
	}

	@Override
	public CategoryDTO updateCategory(CategoryDTO categoryDto) {
		Category category=new Category();
		category.setCategoryId(categoryDto.getCategoryId());
		category.setCategoryName(categoryDto.getCategoryName());
		category.setCategoryDescription(categoryDto.getCategoryDescription());
		
		 category = categoryrepository.save(category);
		 categoryDto.setCategoryId(category.getCategoryId());
		 return categoryDto;
	}

	@Override
	public List<CategoryDTO> getCategory() {
		Iterable<Category> category=categoryrepository.findAll();
		List<CategoryDTO> category2=new ArrayList<>();
		category.forEach(t -> {
			CategoryDTO cat=new CategoryDTO();
			cat.setCategoryId(t.getCategoryId());
			cat.setCategoryName(t.getCategoryName());
			
			cat.setDescription(t.getCategoryDescription());
			category2.add(cat);
		});
		return category2;
	}



	@Override
	public Category getCategoryByID(int categoryId) {
		Optional<Category> optional = categoryrepository.findById(categoryId);
		Category category=optional.get();
		return category;
		
		

}
	
}
