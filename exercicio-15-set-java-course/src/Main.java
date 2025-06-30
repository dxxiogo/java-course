import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import models.entities.Course;
import models.entities.Instructor;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int amount;
		Instructor inst = new Instructor("Diogo");
		
		Course courseA = new Course("Curso A");
		System.out.print("How many students for course A? ");
		amount = sc.nextInt();
		for (int i = 0; i < amount; i++) {
			courseA.addStudent(sc.nextInt());
			sc.nextLine();
		}
		
		Course courseB = new Course("Curso B");
		System.out.print("How many students for course B? ");
		amount = sc.nextInt();
		for (int i = 0; i < amount; i++) {
			courseB.addStudent(sc.nextInt());
			sc.nextLine();
		}
		
		Course courseC = new Course("Curso C");
		System.out.print("How many students for course C? ");
		amount = sc.nextInt();
		for (int i = 0; i < amount; i++) {
			courseC.addStudent(sc.nextInt());
			sc.nextLine();
		}
		
		inst.addCourse(courseA);
		inst.addCourse(courseB);
		inst.addCourse(courseC);
		
		Set<Integer> allStudents = new HashSet<>();
		
		for (Course course: inst.getCourses()) {
			allStudents.addAll(course.getStudents());
		}
		
		System.out.printf("Total students: %d", allStudents.size());
		
		sc.close();
	}

}
