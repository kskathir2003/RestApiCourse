package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Author;
import com.example.demo.repository.AuthorRepo;
import java.util.*;

@Service
public class AuthorService {

	@Autowired
	AuthorRepo ar;
	
	public Author add(Author author) {
		return ar.save(author);
	}
	
	public Author update(Author author) {
		return ar.saveAndFlush(author);
	}
	
	public List<Author> get(){
		return ar.findAll();
	}
	
	public String delete(Author author) {
		ar.delete(author);
		return "deleted successfully";
	}
}
