import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import models.entities.CarRental;
import models.entities.Vehicle;
import models.services.BrazillianRentService;
import models.services.RentalService;

public class Main {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String model = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime startDate = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finishDate = LocalDateTime.parse(sc.nextLine(), fmt);
		
		System.out.print("Entre com o preço por hora: ");
		Double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		Double pricePerDay = sc.nextDouble();
		
		CarRental rental = new CarRental(startDate, finishDate, new Vehicle(model));
		
		RentalService service = new RentalService(pricePerHour, pricePerDay, new BrazillianRentService());
		
		service.processInvoice(rental);
		
		System.out.println("Fatura:");
		System.out.print(rental.getInvoice());
	
		
		sc.close();
	}

}
