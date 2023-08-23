package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import java.util.*;


@RestController
@RequestMapping("/Book")
public class BookController {

	@Autowired
	private BookService bs;
	
	@PostMapping("addbook")
	public Book add(@RequestBody Book book) {
		return bs.addBook(book);
	}
	
	@GetMapping("showbooks")
	public List<Book> get(){
		return bs.showBooks();
	}
	
	@PutMapping("updatebook")
	public Book update(@RequestBody Book book) {
		return bs.update(book);
	}
	
	@DeleteMapping("deletebook")
	public String delete(@RequestBody Book book) {
		return bs.delete(book);
	}
	
	
}
