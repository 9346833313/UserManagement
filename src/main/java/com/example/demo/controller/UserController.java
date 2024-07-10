package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class UserController {

	@PostMapping
	public ResponseEntity<?> postmethod() {
		return null;

	}
<<<<<<< HEAD
	
	
	@GetMapping
	public ResponseEntity<?> getMethod() {
=======
	@PostMapping
	public ResponseEntity<?> GetId() {
>>>>>>> b302c8f313cfa7ccde3baeeacd0cc4e883bbf700
		return null;

	}

}
