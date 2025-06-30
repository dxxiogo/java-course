package models.entities;

import java.util.Objects;

public class Candidate implements Comparable<Candidate> {
	private String name;

	public Candidate(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidate other = (Candidate) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Candidate o) {
		return this.name.compareTo(o.getName());
	}
	
	
	
}
