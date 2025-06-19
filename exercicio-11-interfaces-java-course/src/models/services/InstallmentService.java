package models.services;

import java.time.LocalDate;

import models.entities.Contract;
import models.entities.Installment;
import models.interfaces.PaymentService;

public class InstallmentService {
	
	private PaymentService service;

	public InstallmentService(PaymentService service) {
		this.service = service;
	}

	public PaymentService getService() {
		return service;
	}

	public void setService(PaymentService service) {
		this.service = service;
	}
	

	public void processInstallments (Contract contract, Integer installmentsNumber) {
		
		Double simpleInstallmentValue = contract.getTotalValue() / installmentsNumber;
		for (int i = 1; i <= installmentsNumber; i++) {
			Double simpleInterest = service.simpleInterest(simpleInstallmentValue, i);
			Double installmentValue = service.tax(simpleInstallmentValue + simpleInterest);
			LocalDate installmentDate = contract.getContractDate().plusMonths(i);
			contract.getInstallments().add(new Installment(installmentDate, installmentValue));
		}
	}
	
	
}
