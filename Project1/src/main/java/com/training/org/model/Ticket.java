package com.training.org.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Ticket")

public class Ticket {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="t_id")
	private int t_id=0;
	private double amount=0;
	private String source="";
	private String destination="";
	private String category="";
	public Ticket() {
		
		// TODO Auto-generated constructor stub
	}
	public Ticket(int t_id, double amount, String source, String destination, String category) {
		super();
		this.t_id = t_id;
		this.amount = amount;
		this.source = source;
		this.destination = destination;
		this.category = category;
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Ticket [t_id=" + t_id + ", amount=" + amount + ", source=" + source + ", destination=" + destination
				+ ", category=" + category + "]";
	}
	
	
	
}
