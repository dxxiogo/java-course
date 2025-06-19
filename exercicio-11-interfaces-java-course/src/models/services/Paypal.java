package models.services;

import models.interfaces.PaymentService;

public class Paypal implements PaymentService {
	
	public Double simpleInterest (Double value, Integer installmentNumber) {
		return value * 0.01 * installmentNumber;
	}
	
	public Double tax (Double value) {
		return value + value * 0.02;
	}
	
}
