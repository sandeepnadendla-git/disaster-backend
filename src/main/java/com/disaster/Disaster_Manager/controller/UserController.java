package com.disaster.Disaster_Manager.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disaster.Disaster_Manager.model.User;
import com.disaster.Disaster_Manager.repository.UserRepository;
import com.disaster.Disaster_Manager.service_helper.UserServiceHelper;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/")
public class UserController {
	@Autowired
	UserServiceHelper userservicehp;
 
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return this.userservicehp.findAll();
	}
	
	@GetMapping("/Login")
	public ResponseEntity<String> Login(@RequestBody User user){
		
		List<User> val  = userservicehp.log(user.getEmail(),user.getPassword());;
		if(val.size()>0) {
			 
			 return new ResponseEntity<String>("Not correct", HttpStatus.ALREADY_REPORTED);
		}
		 return new ResponseEntity<>(HttpStatus.OK);	
	}
	
	@GetMapping("/welcome")
	public String getMessage() {
		return "Hello";
	}
	@PostMapping("/register")
	public ResponseEntity<String> Register(@RequestBody User user) {

		System.out.println("asvjadvs"+user.getEmail());
		List<User> val  = userservicehp.checkUser(user.getEmail());
		if(val.size()>0) {
			 
			 return new ResponseEntity<String>("Email, Already found", HttpStatus.ALREADY_REPORTED);
		}
		else {
			userservicehp.postUser(user);
		}
		 return new ResponseEntity<>(HttpStatus.OK);	
}
}
