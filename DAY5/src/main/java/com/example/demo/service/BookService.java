package com.example.demo.service;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import java.util.*;
import com.example.demo.repository.*;
@Service
public class BookService {

	@Autowired
	BookRepository bk;
	
	public List<Book> showBooks(){
		return bk.findAll();
	}
	
	public Optional<Book> showBook(int id){
		return bk.findById(id);
	}
	
	public boolean post(Book book) {
		bk.save(book);
		return true;
	}
	
	public Optional<Book> update(int id , String bookName) {
		bk.getReferenceById(id).setBookName(bookName);
		return bk.findById(id);
	}
	
	public boolean delete(int id) {
		bk.deleteById(id);
		return true;
	}
}
