package com.disaster.Disaster_Manager.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disaster.Disaster_Manager.model.LoginData;
import com.disaster.Disaster_Manager.model.User;
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
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody LoginData user){
		System.out.print(user.getUserName() +","+user.getPassword());
		
		List<User> val  = userservicehp.log(user.getUserName(),user.getPassword());
		System.out.print(val);
		if(val.size()>0) {
			 return new ResponseEntity<>(HttpStatus.OK);
			
		}
		 return new ResponseEntity<String>("Not correct", HttpStatus.ALREADY_REPORTED);	
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
