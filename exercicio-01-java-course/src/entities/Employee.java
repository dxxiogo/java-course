package entities;

public class Employee {
	private Integer id;
	private String name;
	private Double grossSalary;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Employee () {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	
	public void increaseSalary (double percentage) {
		this.grossSalary += (this.grossSalary / percentage);
	}
	
	@Override
	public String toString () {
		return this.id + ", " + this.name + ", " + String.format("%.2f", this.grossSalary);
	}
	
}
