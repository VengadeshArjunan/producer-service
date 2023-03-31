package com.example.client.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {
	
	@Value("${server.port}")
	private String serverHost;
	
	@GetMapping("/message")
	public String message() {
		return "Hello from Producer on port:"+ serverHost;
	}
	
	@GetMapping("/message/{id}")
	public String message(@PathVariable int id) {
		return "Hello from Producer on port:"+ serverHost +" with path parameter ="+ id;
	}
}
