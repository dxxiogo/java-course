package models.entities;

public class Invoice {
	
	
	private Double basicPayment;
	private Double tax;
	
	
	
	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}
	
	
	public Double getBasicPayment() {
		return basicPayment;
	}
	
	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}
	
	public Double getTax() {
		return tax;
	}
	
	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public Double getTotalPayment () {
		return getTax() + getBasicPayment();
	}
	
	@Override
	public String toString () {
		return String.format("Pagamento basico: %.2f\nImposto: %.2f\nPagamento total: %.2f", this.getBasicPayment(), this.getTax(), this.getTotalPayment());
	}
	
	
}
