import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		System.out.println("Enter the number of products:");
		int amount = sc.nextInt();
		
		for (int i = 0; i < amount; i++) {
			System.out.printf("Product #%d data:\n", i + 1);
			System.out.println("Common, used or imported (c/u/i):");
			char productType = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Name:");
			String name = sc.nextLine();
			System.out.println("Price:");
			Double price = sc.nextDouble();
			
			switch (productType) {
				case 'c':
					products.add(new Product(name, price));
				break;
				case 'u':
					System.out.println("Manufcature Date (DD/MM/YYYY):");
					String dateEntered = sc.next();
					products.add(new UsedProduct(name, price, LocalDate.parse(dateEntered, UsedProduct.fmt)));
				break;
				case 'i':
					System.out.println("Customs fee:");
					Double fee = sc.nextDouble();
					products.add(new ImportedProduct(name, price, fee));
				break;
			}
		}
		
		System.out.println("PRICE TAGS:");
		
		for (Product p : products) {
			System.out.println(p.priceTag());
		}
		
		sc.close();

	}

}
