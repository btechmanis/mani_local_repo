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

import com.ecommerce.dto.ShipperDTO;

import com.ecommerce.service.ShipperService;

@RestController
	@RequestMapping("/shipper")
	public class ShipperController {
		@Autowired
		ShipperService shipperService;
		
		@PostMapping(value="/create",consumes=MediaType.APPLICATION_JSON_VALUE)
		public ShipperDTO createShipper(@RequestBody ShipperDTO shipper) {
			return this.shipperService.createShipper(shipper);
					
		}
		@GetMapping("/shippers")
		public List<ShipperDTO> getShipper() {
			return this.shipperService.getShipper();
		}
		@GetMapping("/shippers/{shipperid}")
		public ShipperDTO getShipperByID(@PathVariable int shipperid) {
			return this.shipperService.getShipperByID(shipperid);
		}
		
		@DeleteMapping("/shippers/{shipperid}")
		public void deleteShipper(@PathVariable int shipperid) {
			this.shipperService.deleteShipper(shipperid);
			
		}
		@PutMapping(value="/shippers",consumes=MediaType.APPLICATION_JSON_VALUE)
		public ShipperDTO updateShipper(@RequestBody ShipperDTO shipper) {
			return this.shipperService.updateShipper(shipper);
		}
	}

