package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AuthorService;
import java.util.*;
import com.example.demo.model.*;

@RestController
@RequestMapping("/Author")
public class AuthorController {

	@Autowired
	AuthorService as;
	
	@GetMapping("showauthors")
	public List<Author> show(){
		return as.get();
	}
	
	@PutMapping("updateauthor")
	public Author update(@RequestBody Author author) {
		return as.update(author);
	}
	
	@PostMapping("addauthor")
	public Author add(@RequestBody Author author) {
		return as.add(author);
	}
	
	@DeleteMapping("deleteauthor")
	public String delete(@RequestBody Author author) {
		return as.delete(author);
	}
}
