package models.interfaces;

public interface PaymentService {
	
	public Double simpleInterest (Double value, Integer installmentNumber);
	public Double tax (Double value);
}
