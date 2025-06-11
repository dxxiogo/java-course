package entities;

public class ImportedProduct extends Product{
	private Double customsFee;

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customsFee = customFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag () {
		return super.priceTag() + String.format(" (Custom Fee: $ %.2f)", this.customsFee);
	}
	
	
}
