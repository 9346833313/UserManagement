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
	@PostMapping
	public ResponseEntity<?> add() {
		return null;

<<<<<<< HEAD
=======
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
>>>>>>> 5c05e3cdf1230bb274c92d36d8a27feaee4220b7
	}

}
