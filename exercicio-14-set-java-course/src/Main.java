import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import models.entities.Log;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file full path:");
		String path = sc.nextLine();
		File fileIn = new File(path);
		Set<Log> logs = new HashSet<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileIn))) {
			String line = br.readLine();
			while (line != null) {
				String[] logData = line.split(" ");
				String username = logData[0];
				Instant instant = Instant.parse(logData[1]);
				logs.add(new Log(username, instant));
				line = br.readLine();
			}
			System.out.printf("Total users: %d users", logs.size());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		    sc.close();
		}
			
	}

}
