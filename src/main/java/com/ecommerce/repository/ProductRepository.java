package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.dto.ProductDTO;
import com.ecommerce.model.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

	void save(ProductDTO product);

	

}
