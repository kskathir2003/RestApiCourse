package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.*;

@Entity
@Table(name="orders")
public class Orders {

	@Id
	private int orderId;
	private String books;
//	private float amount;
	private int customerId;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getBooks() {
		return books;
	}
	public void setBooks(String books) {
		this.books = books;
	}
//	public Float getAmount() {
//		return amount;
//	}
//	public void setAmount(float amount) {
//		this.amount = amount;
//	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Orders(int orderId, String books, int customerId) {
		super();
		this.orderId = orderId;
		this.books = books;
//		this.amount = amount;
		this.customerId = customerId;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}
