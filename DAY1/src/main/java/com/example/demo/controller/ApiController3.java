package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController3 {

	@Value("${color}")
	private String color;
	@GetMapping("/favColor")
	public String getMyFav() {
		return "My favourite color is "+color;
	}
}
