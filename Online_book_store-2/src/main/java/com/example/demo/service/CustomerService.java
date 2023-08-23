package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.*;
import com.example.demo.repository.CustomerRepo;
import java.util.*;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo cs;
	
	public List<Customer> getCustomers(){
		return cs.findAll();
	}
	
	public Customer addCustomer(Customer customer) {
		return cs.save(customer);
	}
	
	public Customer updateCustomer(Customer customer) {
		return cs.saveAndFlush(customer);
	}
	
	public String deleteCustomer(Customer customer) {
		cs.delete(customer);
		return "deleted successfully";
	}
}
