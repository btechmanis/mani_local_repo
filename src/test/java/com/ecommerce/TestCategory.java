package com.ecommerce;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.ecommerce.dto.CategoryDTO;
import com.ecommerce.model.Category;
import com.ecommerce.repository.CategoryRepository;
import com.ecommerce.service.CategoryService;

public class TestCategory {
	
	@InjectMocks
	CategoryService CategoryServiceImpl;
	
	@Mock
	CategoryRepository categoryrepository;
	@Mock
	CategoryDTO dto;

	
	
	
	@Test
    void createCategoryTest() {
		MockitoAnnotations.openMocks(this);
		
		dto.setCategoryName("Kids");
		dto.setDescription("Fashion wears for Kids");
		Category categoryEntity = new Category();
		categoryEntity.setCategoryId(dto.getCategoryId());
		categoryEntity.setCategoryName(dto.getCategoryName());
		categoryEntity.setCategoryDescription(dto.getCategoryDescription());
		
		CategoryServiceImpl.createCategory(dto);
		
		verify(categoryrepository, times(1)).save(categoryEntity);
	}

}



