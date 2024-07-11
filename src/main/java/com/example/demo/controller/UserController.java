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
	public ResponseEntity<?> users() {
		return null;

	}

	@GetMapping
	public ResponseEntity<?> getAllUsers() {
		return null;

	}

	@GetMapping
	public ResponseEntity<?> getById() {

		return null;

	}
	
}
