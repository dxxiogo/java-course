package models.entities;

import java.time.Instant;
import java.util.Objects;

public class Log {
	private String username;
	private Instant accessInstant;
	
	
	public Log(String username, Instant accessInstant) {
		super();
		this.username = username;
		this.accessInstant = accessInstant;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public Instant getAccessInstant() {
		return accessInstant;
	}
	
	public void setAccessInstant(Instant accessInstant) {
		this.accessInstant = accessInstant;
	}

	@Override
	public int hashCode() {
		return Objects.hash(username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Log other = (Log) obj;
		return Objects.equals(username, other.username);
	}
	
	
}
