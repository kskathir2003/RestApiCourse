package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.*;
import com.example.demo.service.OrderService;
import java.util.*;

@RestController
@RequestMapping("/Order")
public class OrderController {

	@Autowired
	OrderService os;
	
	@GetMapping("showorders")
	public List<Order> showOrders(){
		return os.showOrders();
	}
	
	@PostMapping("addorder")
	public Order addOrder(Order order) {
		return os.addOrder(order);
	}
	
	@PutMapping("updateorder")
	public Order updateOrder(Order order) {
		return os.updateOrder(order);
	}
	
	@DeleteMapping("deleteorder")
	public String deleteorder(Order order) {
		return os.deleteOrder(order);
	}
}
