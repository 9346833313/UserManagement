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
	public ResponseEntity<?> createUser() {
		return null;

	}

	

	@GetMapping

	public ResponseEntity<?> getAllUsers() {
		return null;
		
	}

	public ResponseEntity<?> get(){

		return null;

	}

	public void hello() {
	}
	public void add( ) {
}

	

}
