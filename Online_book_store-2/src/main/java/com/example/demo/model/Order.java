package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.*;

@Entity
@Table(name="`order`")
public class Order {

	@Id
	private int orderId;
	private List<String> books;
	private float amount;
	private int customerId;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public List<String> getBooks() {
		return books;
	}
	public void setBooks(List<String> books) {
		this.books = books;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Order(int orderId, List<String> books, float amount, int customerId) {
		super();
		this.orderId = orderId;
		this.books = books;
		this.amount = amount;
		this.customerId = customerId;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}
