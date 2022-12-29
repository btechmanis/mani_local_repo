package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dto.CategoryDTO;
import com.ecommerce.dto.ProductDTO;
import com.ecommerce.model.Category;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productrepository;

	@Override
	public int createProduct(ProductDTO productDto) {
		Product product1=new Product();
		product1.setProductName(productDto.getProductName());
		
		product1.setProductBrand(productDto.getProductBrand());
		product1.setProductDescription(productDto.getProductDescription());
		product1.setProductPrice(productDto.getProductPrice());
		product1.setProductSize(productDto.getProductSize());
		product1.setProductColor(productDto.getProductColor());
		product1.setProductDiscount(productDto.getProductDiscount());
		product1.setProductOnorder(productDto.getProductOnorder());
		product1.setProductAvailable(productDto.getProductAvalaible());
		product1.setProductImageurl(productDto.getProductImageurl());
		product1.setProductAvailableStatus(productDto.getProductAvailableStatus());
		Category category = new Category(productDto.getCategory().getCategoryId(), productDto.getCategory().getCategoryName(), productDto.getCategory().getCategoryDescription());
		product1.setCategory(category);
		product1 = productrepository.save(product1);
		 
		return product1.getProductId();
	}


	@Override
	public ProductDTO getProductByID(int productId) {
		Product product = productrepository.findById(productId).get();
		ProductDTO productDto =  new ProductDTO();
		productDto.setProductId(product.getProductId());
		productDto.setProductName(product.getProductName());
		productDto.setProductBrand(product.getProductBrand());
		productDto.setProductDescription(product.getProductDescription());
		productDto.setProductPrice(product.getProductPrice());
		productDto.setProductSize(product.getProductSize());
		productDto.setProductColor(product.getProductColor());
		productDto.setProductDiscount(product.getProductDiscount());
		productDto.setProductOnorder(product.getProductOnorder());
		productDto.setProductAvalaible(product.getProductAvailable());
		productDto.setProductImageurl(product.getProductImageurl());
		productDto.setProductAvailableStatus(product.getProductAvailableStatus());
		CategoryDTO categoryDto = new CategoryDTO(product.getCategory().getCategoryId(), product.getCategory().getCategoryName(), product.getCategory().getCategoryDescription());
		productDto.setCategory(categoryDto);
		return productDto;
			

	}


	@Override
	public void deleteProduct(int productId) {
				
		productrepository.deleteById(productId);
		
	}

	@Override
	public int updateProduct(ProductDTO productDto) {
		Product product1=new Product();
		product1.setProductId(productDto.getProductId());
		product1.setProductName(productDto.getProductName());
		product1.setProductBrand(productDto.getProductBrand());
		product1.setProductDescription(productDto.getProductDescription());
		product1.setProductPrice(productDto.getProductPrice());
		product1.setProductSize(productDto.getProductSize());
		product1.setProductColor(productDto.getProductColor());
		product1.setProductDiscount(productDto.getProductDiscount());
		product1.setProductOnorder(productDto.getProductOnorder());
		product1.setProductAvailable(productDto.getProductAvalaible());
		product1.setProductImageurl(productDto.getProductImageurl());
		product1.setProductAvailableStatus(productDto.getProductAvailableStatus());
		Category category = new Category(productDto.getCategory().getCategoryId(), productDto.getCategory().getCategoryName(), productDto.getCategory().getCategoryDescription());
		product1.setCategory(category);
		product1 = productrepository.save(product1);
		 return product1.getProductId();	
		 }


	@Override
	public List<ProductDTO> getProduct()  {
		Iterable<Product> product=productrepository.findAll();
		List<ProductDTO> product2=new ArrayList<>();
		product.forEach(t -> {
			ProductDTO cat=new ProductDTO();
			cat.setProductName(t.getProductName());
			cat.setProductId(t.getProductId());
			cat.setProductBrand(t.getProductBrand());
			cat.setProductPrice(t.getProductPrice());
			cat.setProductDescription(t.getProductDescription());
			cat.setProductSize(t.getProductSize());
			cat.setProductColor(t.getProductColor());
			cat.setProductDiscount(t.getProductDiscount());
			cat.setProductOnorder(t.getProductOnorder());
			cat.setProductAvalaible(t.getProductAvailable());
			cat.setProductImageurl(t.getProductImageurl());
			cat.setProductAvailableStatus(t.getProductAvailableStatus());
			cat.setCategory(new CategoryDTO(t.getCategory().getCategoryId(), t.getCategory().getCategoryName(), t.getCategory().getCategoryDescription()));
			
			product2.add(cat);
		});
		return product2;
		
	}


	
}
	

	