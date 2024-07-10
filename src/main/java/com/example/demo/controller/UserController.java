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

	
	@GetMapping
	public ResponseEntity<?> getMethod() {
		return null;
	}
	@PostMapping


	public ResponseEntity<?> getAll() {
		return null;
	}
	public ResponseEntity<?> GetId() {

		return null;

	}

}
