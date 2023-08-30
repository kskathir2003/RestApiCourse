package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
	
	public Book updateBook(int id, Book book) {
		Book b = br.findById(id).orElse(null);
		if(b!=null) {
			if(book.getId()!=0) {
				b.setId(book.getId());
			}
			if(book.getAuthorId()!=null) {
				b.setAuthorId(book.getAuthorId());
			}
			if(book.getBookName()!=null) {
				b.setBookName(book.getBookName());
			}
			if(book.getPrice()!=0) {
				b.setPrice(book.getPrice());
			}
			return br.save(b);
		}
		return null;
	}
	
	public Book update(Book book) {
		return br.saveAndFlush(book);
	}
	
	public String delete(Book book) {
		br.delete(book);
		return "deleted succesfully";
	}
	
	public List<Book> getPages(int pgno, int pgsize){
		Page<Book> page = br.findAll(PageRequest.of(pgno, pgsize));
		return page.getContent();	
	}
	
	public List<Book> getPagesWithSort(int pgno, int pgsize, String fld){
		Sort ord = Sort.by(Sort.DEFAULT_DIRECTION, fld);
		Page<Book> page = br.findAll(PageRequest.of(pgno, pgsize, ord));
		return page.getContent();	
	}
}
