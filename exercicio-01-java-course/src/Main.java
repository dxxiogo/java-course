import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;
import entities.Triangulo;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the measures of Triangule X:");
		//double l1 = sc.nextDouble();
		//double l2 = sc.nextDouble();
		//double l3 = sc.nextDouble();
		//Triangulo trianguloX = new Triangulo(l1, l2, l3);
		
		//System.out.println("Enter the measures of Triangule Y:");
		//double l4 = sc.nextDouble();
		//double l5 = sc.nextDouble();
		//double l6 = sc.nextDouble();
		//Triangulo trianguloY = new Triangulo(l4, l5, l6);
		//System.out.printf("Triangle X area: %f\n", trianguloX.area());
		//System.out.printf("Triangle Y area: %f\n", trianguloY.area());
		
		//maiorArea(trianguloX, trianguloY);
		//System.out.println("Enter product data:");
		
		//Product product = new Product();
		
		//product.setName(sc.next());
		//product.setPrice(sc.nextDouble());
		//product.setQuantity(sc.nextInt());
		//System.out.println(product.toString());
		//System.out.println("The number of products to be added in stock: ");
		//int amount = sc.nextInt();
		//product.addProducts(amount);
		//System.out.println(product.toString());
		//System.out.println("The number of products to be removed from stock: ");
		//amount = sc.nextInt();
		//product.removeProducts(amount);
		//System.out.println(product.toString());
		
		//Retangulo rt = new Retangulo();
		
		//System.out.println("Enter with rectangle width and height");
		//rt.setWidth(sc.nextDouble());
		//rt.setHeight(sc.nextDouble());
		
		//System.out.printf("AREA: %.2f\n", rt.area());
		//System.out.printf("PERIMETER: %.2f\n", rt.perimetro());
		//System.out.printf("DIAGONAL: %.2f\n", rt.diagonal());
		
		//System.out.println("Enter employee data:");
		
		//Employee e = new Employee();
		
		//e.setName(sc.next());
		//e.setGrossSalary(sc.nextDouble());
		//e.setTax(sc.nextDouble());
		
		//System.out.println("Employee: " + e);
		//System.out.println("Which percentage to increase salary?");
		//double tax = sc.nextDouble();
		//e.increaseSalary(tax);
		
		//System.out.println("Updated Data: " + e);
		
		//System.out.println("Enter student name:");
		//Aluno aluno = new Aluno();
		//sc.nextLine();
		//aluno.setName(sc.nextLine());
		//System.out.println("Enter grade data:");
		//aluno.setNota1B(sc.nextDouble());
		//aluno.setNota2B(sc.nextDouble());
		//aluno.setNota3B(sc.nextDouble());
		
		
		//double media = aluno.calculaMedia();
		
		//System.out.printf("FINAL GRADE = %.2f\n", media);
		
		//VerificaAprovacao.aprovacao(media);
		
		//System.out.println("What is the dollar price?");
		//double precoDolar = sc.nextDouble();
		//System.out.println("How many dollars will be bought?");
		//double valor = sc.nextDouble();
		
		//System.out.printf("Amount to be  paid in reais = %.2f", CurrencyConverter.calculate(precoDolar, valor));
		
		/*
		 * System.out.println("Enter account number: "); int numberAccount =
		 * sc.nextInt(); System.out.println("Enter account holder: "); String holder =
		 * sc.next(); System.out.println("Is there initial deposit (y/n): "); char
		 * isThereDeposit = sc.next().charAt(0);
		 * 
		 * Conta conta;
		 * 
		 * if(isThereDeposit == 'y') {
		 * System.out.println("Enter with initial deposit value: "); double deposit =
		 * sc.nextDouble(); conta = Banco.criarConta(numberAccount, holder, deposit); }
		 * else { conta = Banco.criarConta(numberAccount, holder); }
		 * 
		 * System.out.println("Enter with deposit value: "); double depositValue =
		 * sc.nextDouble();
		 * 
		 * conta.depositar(depositValue); System.out.print("Updated account data:\n" +
		 * conta);
		 * 
		 * System.out.println("\nEnter a withdraw value: "); double withdrawValue =
		 * sc.nextDouble();
		 * 
		 * conta.sacar(withdrawValue); System.out.print("Updated account data:\n" +
		 * conta);
		 */		
		
		/*
		 * Rent[] rents = new Rent[10];
		 * 
		 * System.out.println("How many rooms will be rented?"); int roomsToRent =
		 * sc.nextInt();
		 * 
		 * 
		 * for (int i = 0; i < roomsToRent; i++) { Rent newRent = new Rent();
		 * sc.nextLine(); System.out.printf("Rent #%d\n", i+1);
		 * System.out.print("Name:"); newRent.setName(sc.next());
		 * System.out.print("Email:"); newRent.setEmail(sc.next());
		 * System.out.print("Room:"); int room = sc.nextInt();
		 * newRent.setRoomNumber(room); rents[room] = newRent;
		 * 
		 * }
		 * 
		 * System.out.println("Busy rooms:");
		 * 
		 * 
		 * for (int i = 0; i < rents.length; i++) { if(rents[i] != null) {
		 * System.out.println(rents[i]); } }
		 */
		
//		List<Employee> employees = new ArrayList<>();
//		
//		System.out.println("How many employees will be resgistered?");
//		Integer amount = sc.nextInt();
//		
//		for(int i = 0; i < amount; i++) {
//			Employee e = new Employee();
//			System.out.printf("Employee #%d\n", i + 1);
//			e.setId(sc.nextInt());
//			sc.nextLine();
//			e.setName(sc.nextLine());
//			e.setGrossSalary(sc.nextDouble());
//			employees.add(e);
//		}
//		
//		System.out.println("Enter the employee id will have increase:");
//		Integer id = sc.nextInt();
//		
//		Employee employee = employees.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
//		if(employee != null) {
//			System.out.println("Enter the percentage:");
//			Double percentage = sc.nextDouble();
//			employees = employees.stream().map(e -> {
//				if(e.equals(employee)) {
//					e.increaseSalary(percentage);
//				}
//				return e;
//			}).collect(Collectors.toList());
//		} else {
//			System.out.println("This id does not exists!");
//		}
//		
//		System.out.println("List of employees:");
//		
//		for(Employee e : employees) {
//			System.out.println(e);
//		}
		
		System.out.println("Enter the amount of lines:");
		int m = sc.nextInt();
		System.out.println("Enter the amount of columns:");
		int n = sc.nextInt();
		System.out.println("Enter the amount of lines:");
		Integer[][] mat = new Integer[m][n];
		
		for(int i = 0; i < m; i++)
			for(int k = 0; k < n; k ++) {
				mat[i][k] = sc.nextInt();
			}
		
		System.out.println("Enter with a number that belongs to mat:");
		int x = sc.nextInt();
		

		
		for(int i = 0; i < m; i++) {
			for(int k = 0; k < n; k ++) {
			
				if(mat[i][k] == x) {
					System.out.printf("Position: %d, %d\n", i, n);
					if(k > 0) {
						System.out.printf("Left: %d\n", mat[i][k - 1]);
					}
					if(i  > 0) {
						System.out.printf("Right: %d\n", mat[i][k + 1]);
					}
					if( k > mat[i].length-1) {
						System.out.printf("Up: %d\n", mat[i-1][k]);
					}
					if(i < mat.length-1) {
						System.out.printf("Down: %d\n", mat[i+1][k]);
					}
				}
				
			}
		}
		
		sc.close();
	}
	
	public static void maiorArea (Triangulo tx, Triangulo ty ) {
		if(tx.area() > ty.area()) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
	}

}
