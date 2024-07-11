package com.example.demo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class UserController {

	

	public ResponseEntity<?> delete(){
		return null;
	}
<<<<<<< HEAD
=======

	@GetMapping
	public ResponseEntity<?> getAllUsers() {
		return null;

	}

	@GetMapping
	public ResponseEntity<?> getById() {

		return null;

	}
	
>>>>>>> a48cd38a910ad4e6a37ef6d51e52b310349d229f
}
