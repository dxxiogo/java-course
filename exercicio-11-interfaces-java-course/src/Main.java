import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import models.entities.Contract;
import models.entities.Installment;
import models.services.InstallmentService;
import models.services.Paypal;

public class Main {

	public static void main(String[] args) {
		
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int contractNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate contractDate = LocalDate.parse(sc.nextLine(), fmt);
		System.out.print("Valor do contrato: ");
		double contractValue = sc.nextDouble();
		System.out.print("Entre com o numero de parcelas: ");
		int installmentsNumber = sc.nextInt();
		
		Contract contract = new Contract(contractNumber, contractDate, contractValue);
		
		InstallmentService service = new InstallmentService(new Paypal());
		service.processInstallments(contract, installmentsNumber);
		
		System.out.println("Parcelas:");
		for (Installment i : contract.getInstallments()) {
			System.out.println(i);
		}
		
				
		sc.close();
	}

}
