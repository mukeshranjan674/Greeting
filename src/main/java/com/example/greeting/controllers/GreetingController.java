package com.example.greeting.controllers;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class GreetingController {
	
	private static final Logger logger = LoggerFactory.getLogger(GreetingController.class);

	
	@GetMapping("/get")
	public ResponseEntity<String> get(@RequestHeader(value = "X-Trace-Id", required = false) String traceId){
		
		if (traceId == null) {
	        traceId = UUID.randomUUID().toString();
	    }
		
		logger.info("Trace id : {} | API : {} | details : {}", traceId, "GET /get", "return greeting"); 
		String greeting = "Hello";
		return new ResponseEntity<>(greeting, HttpStatus.OK);
	}
	

}
