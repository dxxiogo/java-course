import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import enums.WorkerLevel;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter departament's name:");
		Worker worker = new Worker();
		worker.setDepartament(new Departament(sc.nextLine()));
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		worker.setName(sc.nextLine());
		System.out.print("Level: ");
		worker.setLevel(WorkerLevel.valueOf(sc.nextLine()));
		System.out.print("Base salary: ");
		worker.setBaseSalary(sc.nextDouble());


		System.out.print("How many contracts to this worker: ");
		Integer contractsAmount = sc.nextInt();
		sc.nextLine();

		for(int i = 0; i < contractsAmount; i++) {
		    System.out.printf("Enter contract %d data:\n", i + 1);
		    HourContract contract = new HourContract();
		    
		    System.out.print("Date (DD/MM/yyyy): ");
		    String dateEntered = sc.nextLine();
		    contract.setDate(LocalDate.parse(dateEntered, fmt1));

		    System.out.print("Value per hour: ");
		    contract.setValuePerHour(sc.nextDouble());

		    System.out.print("Duration (hours): ");
		    contract.setHours(sc.nextInt());
		    sc.nextLine();

		    worker.addContract(contract);
		}

		System.out.print("Enter month and year to calculate income (MM/yyyy): ");
		String period = sc.nextLine();
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MM/yyyy");
		LocalDate dateFormatted = LocalDate.parse("01/" + period, fmt1);

		System.out.printf("Name: %s\nDepartament: %s\nIncome for %s: %.2f", 
		    worker.getName(), worker.getDepartament().getName(), period, worker.income(dateFormatted.getYear(), dateFormatted.getMonthValue()));

		sc.close();


	}

}
