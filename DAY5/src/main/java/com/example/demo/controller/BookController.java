package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.*;
import java.util.*;
import com.example.demo.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService ser;
	
	@GetMapping("showbooks")
	public List<Book> getBooks(){
		return ser.showBooks();
	}
	
	@GetMapping("showbookbyid{id}")
	public Optional<Book> getBookById(@PathVariable int id) {
		return ser.showBook(id);
	}
	
	@PostMapping("post")
	public boolean post(@RequestBody Book book) {
		return ser.post(book);
	}
	
	@PutMapping("/put/{id}/{name}")
	public Optional<Book> update(@PathVariable int id, @PathVariable String name) {
		return ser.update(id, name);
	}
	
	@DeleteMapping("delete/{id}")
	public boolean delete(@PathVariable int id) {
		return ser.delete(id);	
	}
}
