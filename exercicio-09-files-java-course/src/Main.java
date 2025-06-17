import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import models.entities.Product;


public class Main {

	public static void main(String[] args) {
		
		File fileIn = new File("C:\\Users\\diogo\\OneDrive\\Documents\\in\\in.txt");
        File outputFolder = new File("C:\\Users\\diogo\\OneDrive\\Documents\\in\\out");
        
        if (!outputFolder.exists()) {
            outputFolder.mkdir();
        }

        File output = new File(outputFolder, "summary.txt");
        List<Product> products = new ArrayList<>();
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileIn))) {
			String line = br.readLine();
			while (line != null) {
				String[] productData = line.split(",");
				System.out.println(productData[2]);
				String name = productData[0];
				Double price = Double.parseDouble( productData[1]);
				Integer quantity = Integer.parseInt(productData[2]);
				products.add(new Product(name, price, quantity));
				line = br.readLine();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(output))) {
			
			for (Product p : products) {
				System.out.println(p.getName());
				bw.write(String.format("%s,%.2f", p.getName(), p.getPrice() * p.getQuantity()));

				bw.newLine();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

}
