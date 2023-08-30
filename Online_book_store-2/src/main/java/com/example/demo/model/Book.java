package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="book")
public class Book {

	@Id
	private int id;
	private String bookName;
	private String authorId;
	private float price;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "auth_id")
	private Author author;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorId() {
		return authorId;
	}
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Book(int id, String bookName, String authorId, float price, Author author1) {
		super();
		this.author = author1;
		this.id = id;
		this.bookName = bookName;
		this.authorId = authorId;
		this.price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
