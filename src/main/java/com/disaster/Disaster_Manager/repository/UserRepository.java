package com.disaster.Disaster_Manager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.disaster.Disaster_Manager.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("SELECT u FROM User u WHERE u.email = :email")
	List<User> findBymail(@Param("email")String email);

//	@Query("SELECT u FROM User u WHERE u.email = :email and u.password = :password")
//	List<User> Log(@Param("email")String email,@Param("password")String password);

	
}
