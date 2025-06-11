package entities;

import java.util.ArrayList;
import java.util.List;

import enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private Departament departament;
	List<HourContract> hourContracts = new ArrayList<>();
	
	public Worker () {
		
	}
	
	public Worker (String name, WorkerLevel level, Double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.setDepartament(departament);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public void addContract (HourContract contract) {
		this.hourContracts.add(contract);
	}
	
	public void removeContract (HourContract contract) {
		this.hourContracts.remove(contract);
	}
	
	public Double income (Integer year, Integer month) {
		return this.hourContracts.stream().filter(c -> c.getDate().getYear() == year  && c.getDate().getMonthValue() == month)
				.mapToDouble(c -> c.totalValue()).sum() + this.baseSalary;
				
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}
}
