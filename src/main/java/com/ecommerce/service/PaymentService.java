package com.ecommerce.service;


import java.util.List;

import com.ecommerce.dto.PaymentDTO;

public interface PaymentService {

	public PaymentDTO createPayment(PaymentDTO payment);

	 public List<PaymentDTO> getPayment();

	 public PaymentDTO getPaymentByID(int paymentid);

	

	 public void deletePayment(int paymentid);

	 PaymentDTO updatePayment(PaymentDTO payment);



}
