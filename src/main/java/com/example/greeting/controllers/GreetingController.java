package com.example.greeting.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class GreetingController {
	
	@GetMapping("/get")
	public ResponseEntity<String> get(){
		String greeting = "Hello";
		return new ResponseEntity<>(greeting, HttpStatus.OK);
	}
	

}
