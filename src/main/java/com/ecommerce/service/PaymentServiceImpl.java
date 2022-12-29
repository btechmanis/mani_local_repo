package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ecommerce.dto.PaymentDTO;

import com.ecommerce.model.Payment;
import com.ecommerce.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	
	@Autowired PaymentRepository paymentrepository;

	@Override
	public PaymentDTO createPayment(PaymentDTO paymentDto) {
		Payment payment1=new Payment();
		
		payment1.setPaymentType(paymentDto.getPaymentType());
		payment1.setPaymentAmount(paymentDto.getPaymentAmount());
		 payment1= paymentrepository.save(payment1);
		 paymentDto.setPaymentId(payment1.getPaymentId());
		 return paymentDto;
	}

	@Override
	public List<PaymentDTO> getPayment() {
		Iterable<Payment> payment=paymentrepository.findAll();
		List<PaymentDTO> payment2=new ArrayList<>();
		payment.forEach(t -> {
			PaymentDTO cat=new PaymentDTO();
			cat.setPaymentId(t.getPaymentId());
			cat.setPaymentType(t.getPaymentType());
			cat.setPaymentAmount(t.getPaymentAmount());
			payment2.add(cat);
		});
		return payment2;
	}

	@Override
	public PaymentDTO getPaymentByID(int paymentId) {
		Payment payment = paymentrepository.findById(paymentId).get();
		PaymentDTO paymentDto=new PaymentDTO();

		paymentDto.setPaymentId(payment.getPaymentId());
		paymentDto.setPaymentType(payment.getPaymentType());
		paymentDto.setPaymentAmount(payment.getPaymentAmount());
		return paymentDto;
	}

	@Override
	public void deletePayment(int paymentId) {
		Optional<Payment> cat=paymentrepository.findById(paymentId);
		
		paymentrepository.deleteById(paymentId);
		
	}

	@Override
	public PaymentDTO updatePayment(PaymentDTO payment) {
		Payment payment1=new Payment();
		payment1.setPaymentId(payment.getPaymentId());
		payment1.setPaymentType(payment.getPaymentType());
		payment1.setPaymentAmount(payment.getPaymentAmount());
		 payment1= paymentrepository.save(payment1);
		 payment.setPaymentId(payment1.getPaymentId());
		 return payment;
	}
}
