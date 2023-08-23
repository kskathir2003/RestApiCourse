package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.BookRepo;
import com.example.demo.model.*;
import java.util.*;

@Service
public class BookService {

	@Autowired
	private BookRepo br;
	
	public List<Book> showBooks(){
		return br.findAll();
	}
	
	public Book addBook(Book book) {
		return br.save(book);
	}
	
	public Book update(Book book) {
		return br.saveAndFlush(book);
	}
	
	public String delete(Book book) {
		br.delete(book);
		return "deleted succesfully";
	}
}
