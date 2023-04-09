package com.example.client.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {
	Logger logger = LoggerFactory.getLogger(ProducerController.class);
	@Value("${server.port}")
	private String serverHost;
	
	@GetMapping("/message")
	public String message() {
		logger.info("*****Started data from producer using endpoint /message");
		return "Hello from Producer on port:"+ serverHost;
	}
	
	@GetMapping("/message/{id}")
	public String message(@PathVariable int id) {
		logger.info("*****Started data from producer using endpoint /message/id");
		return "Hello from Producer on port:"+ serverHost +" with path parameter ="+ id;
	}
}
