package com.example.client.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
	
	@Value("${server.port}")
	private String serverHost;
	
	@GetMapping("message")
	public String message() {
		return "Hello from Producer on port:"+ serverHost;
	}
}
