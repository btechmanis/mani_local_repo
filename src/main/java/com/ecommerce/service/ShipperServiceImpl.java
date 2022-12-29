package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ecommerce.dto.ShipperDTO;

import com.ecommerce.model.Shipper;
import com.ecommerce.repository.ShipperRepository;

@Service
public class ShipperServiceImpl implements ShipperService {

	@Autowired ShipperRepository shipperrepository;

	@Override
	public ShipperDTO createShipper(ShipperDTO shipperDto) {
		Shipper shipper=new Shipper();
		
		shipper.setPhoneNumber(shipperDto.getPhoneNumber());
		shipper.setCompanyName(shipperDto.getCompanyName());
		shipper.setShipperAddress(shipperDto.getShipperAddress());
		shipper= shipperrepository.save(shipper);
		 shipperDto.setShipperId(shipper.getShipperId());
		 return shipperDto;
	}

	@Override
	public List<ShipperDTO> getShipper() {
		Iterable<Shipper> shipper=shipperrepository.findAll();
		List<ShipperDTO> shipper2=new ArrayList<>();
		shipper.forEach(t -> {
			ShipperDTO cat=new ShipperDTO();
			cat.setShipperId(t.getShipperId());
			cat.setPhoneNumber(t.getPhoneNumber());
			cat.setCompanyName(t.getCompanyName());
			cat.setShipperAddress(t.getShipperAddress());
			shipper2.add(cat);
		});
		return shipper2;
	}

	@Override
	public ShipperDTO getShipperByID(int shipperId) {
		Shipper shipper = shipperrepository.findById(shipperId).get();
		ShipperDTO shipperDto= new ShipperDTO();
		
		shipperDto.setShipperId(shipper.getShipperId());
		shipperDto.setPhoneNumber(shipper.getPhoneNumber());
		shipperDto.setCompanyName(shipper.getCompanyName());
		shipperDto.setShipperAddress(shipper.getShipperAddress());
		return shipperDto;
	}

	@Override
	public void deleteShipper(int shipperid) {
		Optional<Shipper> cat=shipperrepository.findById(shipperid);
		
		shipperrepository.deleteById(shipperid);
		
	}

	@Override
	public ShipperDTO updateShipper(ShipperDTO shipperDto) {
		Shipper shipper=new Shipper();
		shipper.setShipperId(shipperDto.getShipperId());
		shipper.setPhoneNumber(shipperDto.getPhoneNumber());
		shipper.setCompanyName(shipperDto.getCompanyName());
		shipper.setShipperAddress(shipperDto.getShipperAddress());
		shipper= shipperrepository.save(shipper);
		 shipperDto.setShipperId(shipper.getShipperId());
		 return shipperDto;

	}

}