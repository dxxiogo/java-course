import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.println("Enter the number of employees:");
		int amount = sc.nextInt();
		
		for (int i = 0; i < amount; i++) {
			System.out.printf("Employee #%d data:\n", i + 1);
			System.out.println("Outsourced (y/n):");
			char isOutsourced = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Name:");
			String name = sc.nextLine();
			System.out.println("Hours:");
			Integer hours = sc.nextInt();
			System.out.println("Value per hour:");
			Double valuePerHour = sc.nextDouble();
			
			if(isOutsourced == 'y') {
				System.out.println("Additional charge:");
				Double additionalCharge = sc.nextDouble();
				employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else if (isOutsourced == 'n') {
				employees.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println("Payments:");
		
		for (Employee e : employees) {
			System.out.println(e);
		}
		
		sc.close();

	}
	


}
