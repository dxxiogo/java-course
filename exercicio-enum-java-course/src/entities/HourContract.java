package entities;

import java.time.LocalDate;

public class HourContract {
	public LocalDate date;
	public Double valuePerHour;
	public Integer hours;
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Double getValuePerHour() {
		return valuePerHour;
	}
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public Double totalValue () {
		return this.valuePerHour * this.hours;
	}
}
