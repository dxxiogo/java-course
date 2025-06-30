import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import models.entities.Candidate;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file full path: ");
		File path = new File(sc.nextLine());
		Map<Candidate, Integer> candidates = new TreeMap<>();
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				Candidate candidate = new Candidate(fields[0]);
				if(candidates.containsKey(candidate)) {
					int voteCount = candidates.get(candidate);
					candidates.put(candidate, voteCount + Integer.parseInt(fields[1]));
				} else {
					candidates.put(candidate, Integer.parseInt(fields[1]));
				}
				
				line = br.readLine();
			}
		
			for (Candidate c : candidates.keySet()) {
				System.out.printf("%s: %d\n", c.getName(), candidates.get(c));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

}
