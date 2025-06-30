package models.entities;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
	
	private String name;
	private List<Course> courses = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	
	public Instructor(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Course> getCourses() {
		return courses;
	}
	
	public void addCourse (Course course) {
		courses.add(course);
	}
	
}
