import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import models.entities.Product;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter file full path: ");
		File path = new File(sc.nextLine());
		List<Product> products = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				products.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			Double averagePrice = products.stream().map(Product::getPrice).reduce(0.00, (p1, p2) -> p1 + p2) / products.size();
			
			System.out.printf("Average price: %.2f\n", averagePrice);
			
			products.sort((p1, p2) -> -p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
			List<String> productsAboveAvaregePrice = products.stream().filter(p -> p.getPrice() < averagePrice).map(Product::getName).collect(Collectors.toList());
			
			productsAboveAvaregePrice.forEach(System.out::println);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		
		

	}

}
