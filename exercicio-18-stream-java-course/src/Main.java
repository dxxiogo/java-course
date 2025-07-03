import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import models.entities.Employee;


public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter file full path: ");
		File path = new File(sc.nextLine());
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.printf(" Email of people whose salary is more than %.2f\n", salary);
			
			List<String> emails = employees.stream().filter(e -> e.getSalary() > salary).map(Employee::getEmail).collect(Collectors.toList());
			
			emails.sort((e1, e2) -> e1.compareTo(e2));
			emails.forEach(System.out::println);
			
			Double sumSalary = employees.stream().filter(e -> e.getName().charAt(0) == 'M')
					.map(Employee::getSalary).reduce(0.00, (e1, e2) -> e1 + e2);
			
			System.out.printf("Sum of salary of people whose name starts with 'M': %.2f", sumSalary);
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		

	}

}
