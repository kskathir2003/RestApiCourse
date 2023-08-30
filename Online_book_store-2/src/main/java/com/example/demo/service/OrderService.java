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
	
	public List<Orders> showOrders(){
		return or.findAll();
	}
	
	public Orders addOrder(Orders order) {
		return or.save(order);
	}
	
	public Orders updateOrder(Orders order) {
		return or.saveAndFlush(order);
	}
	
	public String deleteOrder(Orders order) {
		or.delete(order);
		return "deleted successfully";
	}
}
