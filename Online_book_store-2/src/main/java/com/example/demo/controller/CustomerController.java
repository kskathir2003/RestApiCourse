package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CustomerService;
import com.example.demo.model.*;
import java.util.*;

@RestController
@RequestMapping("/Customer")
public class CustomerController {

	@Autowired
	CustomerService cs;
	
	@GetMapping("showcustomers")
	public List<Customer> showCustomers(){
		return cs.getCustomers();
	}
	
	@PostMapping("addcustomer")
	public Customer postCustomer(@RequestBody Customer customer) {
		return cs.addCustomer(customer);
	}
	
	@PutMapping("updatecustomer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return cs.updateCustomer(customer);
	}
	
	@DeleteMapping("deletecustomer")
	public String deleteCustomer(@RequestBody Customer customer) {
		return cs.deleteCustomer(customer);
	}
	
}
