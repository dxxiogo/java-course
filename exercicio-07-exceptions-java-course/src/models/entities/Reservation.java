package models.entities;



import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Reservation {
	
	public static DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
    private Integer rooomNumber;
    private LocalDateTime checkin;
    private LocalDateTime chekout;
    
    
	public Reservation(Integer rooomNumber, LocalDateTime checkin, LocalDateTime chekout) {
		super();
		this.rooomNumber = rooomNumber;
		this.checkin = checkin;
		this.chekout = chekout;
	}
	
	public Integer getRooomNumber() {
		return rooomNumber;
	}
	
	public void setRooomNumber(Integer rooomNumber) {
		this.rooomNumber = rooomNumber;
	}
	
	
	public void setCheckin(LocalDateTime checkin) {
		this.checkin = checkin;
	}
	
	public LocalDateTime getChekout() {
		return chekout;
	}
    
	public void updateDates(LocalDateTime checkin, LocalDateTime checkout) {
		this.checkin = checkin;
		this.chekout = checkout;
	}
    
    public Long duration () {
    	Duration duration = Duration.between(chekout, checkin);
    	return duration.toDays();
    }
    
    @Override
    public String toString () {
    	return "Room " + this.rooomNumber + ", check-in: " 
    			+ fmt.format(checkin) + ", check-out: " 
    			+ fmt.format(this.chekout) + ", " + String.format(" %d nights", this.duration());
    }
    
}