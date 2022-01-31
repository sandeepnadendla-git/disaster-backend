package com.disaster.Disaster_Manager.service_helper;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disaster.Disaster_Manager.model.User;
import com.disaster.Disaster_Manager.repository.UserRepository;

@Service
@Transactional
public class UserServiceHelper {
	@Autowired
	private UserRepository userRepository;

	public List<User> checkUser(String email) {
		return userRepository.findBymail(email);
	}

	public void postUser(User user) {
		userRepository.save(user);
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public List<User> log( String email,String password) {
		// TODO Auto-generated method stub
		return userRepository.Log(email,password);
	}

	
}
