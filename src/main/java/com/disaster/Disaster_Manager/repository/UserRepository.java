package com.disaster.Disaster_Manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.disaster.Disaster_Manager.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
