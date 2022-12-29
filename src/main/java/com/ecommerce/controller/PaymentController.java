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

import com.ecommerce.dto.PaymentDTO;

import com.ecommerce.service.PaymentService;

@RestController
	@RequestMapping("/payment")
	public class PaymentController {
		@Autowired
		PaymentService paymentService;

		@PostMapping(value="/create", consumes=MediaType.APPLICATION_JSON_VALUE)
		public PaymentDTO createPayment(@RequestBody PaymentDTO payment) {
			return this.paymentService.createPayment(payment);
				
		}
		
		
		@GetMapping("/payments")
		public List<PaymentDTO> getPayment() {
			return this.paymentService.getPayment();
		}
		
		
		@GetMapping("/payments/{paymentid}")
		public PaymentDTO getPaymentByID(@PathVariable int paymentid) {
			return this.paymentService.getPaymentByID(paymentid);
		}
		
		
		@DeleteMapping("/payments/{paymentid}")
		public void deletePayment(@PathVariable int paymentid) {
			this.paymentService.deletePayment(paymentid);
			
		}
		
		
		@PutMapping("/payments")
		public PaymentDTO updatePayment(@RequestBody PaymentDTO payment) {
			return this.paymentService.updatePayment(payment);
		}

	}

