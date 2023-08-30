package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="authortable")
public class Author {

	@Id
	private int id;
	private String name;
	private String biography;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="auth_id")
	private List<Book> books;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBiography() {
		return biography;
	}
	public void setBiography(String biography) {
		this.biography = biography;
	}
	public Author(int id, String name, String biography) {
		super();
		this.id = id;
		this.name = name;
		this.biography = biography;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}
