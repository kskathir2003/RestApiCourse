package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService es;
	
	@GetMapping("/addemp")
	public Employee addEmp(@RequestBody Employee e) {
		return es.add(e);
	}
	
	@GetMapping("/showemp")
	public List<Employee> showEmp() {
		return es.show();	
	}	
	
	@GetMapping("{id}")
	public Employee show2(@PathVariable long id) {
		return (es.show1(id));
	}
	
}
