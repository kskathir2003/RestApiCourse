package com.example.demo.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ser;
	
	@GetMapping("showdetails")
	public List<StudentEntity> show(){
		return ser.show();
	}
	
	@PostMapping("add")
	public StudentEntity add(@RequestBody StudentEntity ss) {
		return ser.add(ss);
	}
	
	@PutMapping("updatestudent")
	public StudentEntity update(@RequestBody StudentEntity ss) {
		return ser.updateInfo(ss);
	}
	
	@DeleteMapping("deletestudent")
	public String deletestudent(@RequestBody StudentEntity ss) {
		return ser.deleteInfo(ss);
	}
	
	@DeleteMapping("deleteById")
	public String deleteStudent(@RequestBody int id) {
		return ser.deleteInfo(id);
	}
}
