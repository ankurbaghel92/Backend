package com.niit.yamahaonlinebackend.model;

import org.springframework.stereotype.Component;

@Component
public class PaymentMethod {
private String paymentmethod;

public String getPaymentmethod() {
	return paymentmethod;
}

public void setPaymentmethod(String paymentmethod) {
	this.paymentmethod = paymentmethod;
}

	
}
