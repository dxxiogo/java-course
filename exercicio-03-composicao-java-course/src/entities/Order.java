package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private LocalDate moment;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<>();
	private Client client;
	
	
	public LocalDate getMoment() {
		return moment;
	}
	public void setMoment(LocalDate moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem (OrderItem item) {
		this.items.add(item);
	}
	
	public void removeItem (OrderItem item) {
		this.items.remove(item);
	}
	
	public Double total () {
		double total = 0;
		for (OrderItem item: this.items) {
			total += item.subTotal();
		}
		return total;
	}
}
