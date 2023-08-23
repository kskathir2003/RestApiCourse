package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.*;
import java.util.*;
import com.example.demo.repository.OrderRepo;

@Service
public class OrderService {

	@Autowired
	OrderRepo or;
	
	public List<Order> showOrders(){
		return or.findAll();
	}
	
	public Order addOrder(Order order) {
		return or.save(order);
	}
	
	public Order updateOrder(Order order) {
		return or.saveAndFlush(order);
	}
	
	public String deleteOrder(Order order) {
		or.delete(order);
		return "deleted successfully";
	}
}
