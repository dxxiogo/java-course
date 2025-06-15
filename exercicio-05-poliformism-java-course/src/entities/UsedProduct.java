package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class UsedProduct extends Product {
	
	public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate manufactureDate;
	public UsedProduct(String name, Double price, LocalDate manufactreDate) {
		super(name, price);
		this.manufactureDate = manufactreDate;
	}
	
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	
	@Override
	public String priceTag(){
		return this.getName() + " (used) $ " +
	String.format("%.2f (Manufacture date: %s)", this.getPrice(), fmt.format(manufactureDate));
	}
	
	
}
