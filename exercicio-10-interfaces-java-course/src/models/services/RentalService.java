package models.services;

import java.time.Duration;

import models.entities.CarRental;
import models.entities.Invoice;
import models.interfaces.TaxService;

public class RentalService {
	
	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService taxService;

	
	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public TaxService getTaxService() {
		return taxService;
	}

	public void setTaxService(TaxService taxService) {
		this.taxService = taxService;
	}
	
	public void processInvoice (CarRental rent) {
		Duration duration = Duration.between(rent.getStart(), rent.getFinish());
		Long totalHours = (long) Math.ceil(duration.toMinutes() / 60.0);
		System.out.println(totalHours);
		if( totalHours < 12) {
			Double tax = taxService.tax(pricePerHour * totalHours);
			System.out.printf("Taxa calculada: %f, total de horas %d\n", tax, totalHours);
			rent.setInvoice(new Invoice(pricePerHour * totalHours, tax));
		} else {
			Long totalDays = (long) Math.ceil( duration.toMinutes() / 1440.0);
			Double tax = taxService.tax(pricePerDay * totalDays);
			rent.setInvoice(new Invoice(pricePerDay * totalDays, tax));
		}
	}
	
	
}
