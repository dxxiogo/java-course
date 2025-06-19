package models.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	
	static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate paymentDate;
	private Double value;
	
	public Installment(LocalDate paymentDate, Double value) {
		this.paymentDate = paymentDate;
		this.value = value;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	@Override
	public String toString () {
		
		return String.format("%s - %.2f", fmt.format(paymentDate), value);
	}
}
