import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;


public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers:");
		int amount = sc.nextInt();
		
		for (int i = 0; i < amount; i++) {
			System.out.printf("Tax payer #%d data:\n", i + 1);
			System.out.println("Individual or Company (c/i):");
			char productType = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Name:");
			String name = sc.nextLine();
			System.out.println("Anual Income:");
			Double anualIncome = sc.nextDouble();
			
			switch (productType) {
				case 'i':
					System.out.println("Health Expenditures:");
					Double healthExpenditures = sc.nextDouble();
					pessoas.add(new PessoaFisica(name, anualIncome, healthExpenditures));
				break;
				case 'c':
					System.out.println("Number of employees:");
					Integer numberOfEmployees = sc.nextInt();
					pessoas.add(new PessoaJuridica(name, anualIncome, numberOfEmployees));
				break;
			}
		}
		
		System.out.println("TAXES PAID:");
		
		double total = 0.00;
		
		for (Pessoa p : pessoas) {
			System.out.println(p);
			total += p.imposto();
		}
		
		System.out.printf("TOTAL TAXES: %.2f", total);
		
		sc.close();

	}

}
