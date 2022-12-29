package com.ecommerce.service;

import java.util.List;

import com.ecommerce.dto.ShipperDTO;

public interface ShipperService {

	ShipperDTO createShipper(ShipperDTO shipper);

	List<ShipperDTO> getShipper();

	ShipperDTO getShipperByID(int shipper_id);

	
	void deleteShipper(int shipper_id);

	ShipperDTO updateShipper(ShipperDTO shipper);

}
