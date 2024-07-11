package com.example.demo.service;

import org.springframework.http.ResponseEntity;

import com.example.demo.entity.User;

public interface UserService {
public ResponseEntity<?> createUser(User user);
public ResponseEntity<?> getUsers();
public ResponseEntity<?> getById(long id);
public ResponseEntity<?> updateUser(User user,long id);
public ResponseEntity<?> deleteUser(long id);

}
