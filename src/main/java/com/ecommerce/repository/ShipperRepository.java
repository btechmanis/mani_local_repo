package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.dto.ShipperDTO;
import com.ecommerce.model.Shipper;

@Repository
public interface ShipperRepository extends JpaRepository<Shipper,Integer> {

	void save(ShipperDTO shipper);
	

}
