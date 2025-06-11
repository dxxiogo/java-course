package entities;

public class Triangulo {
	
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo (double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	
	public double area() {
	    double p = (this.lado1 + this.lado2 + this.lado3) / 2;
	    return Math.sqrt(p * (p - this.lado1) * (p - this.lado2) * (p - this.lado3));
	}

}
