package models.services;

import models.interfaces.TaxService;

public class BrazillianRentService implements TaxService {
	
	public  Double tax (Double amount) {
		if(amount <= 100) {
			return amount * 0.20;
		}
		return amount * 0.15;
	}

}
