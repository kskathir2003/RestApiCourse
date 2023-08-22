package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository er;
	
	public Employee add(Employee e) {
		return er.save(e);
	}
	
	public List<Employee> show(){
		return er.findAll();
	}
	
	public Employee show1(long id) {
		return er.findById((int) id);
	}
}
