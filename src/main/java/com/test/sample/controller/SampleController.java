package com.test.sample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class SampleController {
	
	@GetMapping
	public ResponseEntity<?> test(){
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://example.com";
		restTemplate.getForObject(url, String.class);
		return ResponseEntity.status(HttpStatus.OK).body("Acesso realizado");
		
	}

}
