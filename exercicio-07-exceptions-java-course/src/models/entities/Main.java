package models.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("Room number:");
		int number = sc.nextInt();
		System.out.println("Check-in date (dd/MM/yyyy): ");
		LocalDateTime checkin = (LocalDateTime) fmt.parse(sc.nextLine());
		
		sc.close();
	}

}
