package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.demo.model.StudentEntity;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo sr;	
	
	public List<StudentEntity> show(){
		return sr.findAll();	
	}
	
	public StudentEntity add(StudentEntity ss) {
		return sr.save(ss);
	}
	
	public StudentEntity updateInfo(StudentEntity ss) {
		return sr.saveAndFlush(ss);
	}
	
	public String deleteInfo(StudentEntity ss) {
		sr.delete(ss);
		return "Deleted successfully";
	}
	
	public String deleteInfo(int id) {
		sr.deleteById(id);
		return "Deleted successfully";
	}
}
