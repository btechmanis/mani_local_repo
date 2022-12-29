package com.ecommerce.service;


import java.util.List;

import com.ecommerce.dto.ProductDTO;


public interface ProductService {

	public int createProduct(ProductDTO product);

	public ProductDTO getProductByID(int productId);

	

	public void deleteProduct(int productId);

	public int updateProduct(ProductDTO product);

	

	public List<ProductDTO> getProduct();

	

}
