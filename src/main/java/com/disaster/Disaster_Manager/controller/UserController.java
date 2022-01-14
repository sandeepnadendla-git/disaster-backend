package com.disaster.Disaster_Manager.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disaster.Disaster_Manager.model.User;
import com.disaster.Disaster_Manager.repository.UserRepository;

@RestController
@RequestMapping("/api/v1/")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
		
    //getUsers
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return this.userRepository.findAll();
	}
	@GetMapping("/welcome")
	public String getMessage() {
		return "Hello";
	}
	
	@PostMapping("register")
	public ResponseEntity<HttpStatus> Register(@RequestBody User user) {
		System.out.println(user);
		try {
			
			this.userRepository.save(user);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
