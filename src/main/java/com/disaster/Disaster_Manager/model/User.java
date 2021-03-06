package com.disaster.Disaster_Manager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//import org.hibernate.annotations.*;

@Entity
@Table(name = "User_tbl")
public class User {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "user_id")
	private int UserID;
	
	@Column(name = "first_name")
	private String FirstName;
	
	@Column(name = "last_name")
	private String LastName;
	
	
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "user_name")
	private String UserName;
	
	@Column(name = "qualification")
	private String Qualification;
	
	@Column(name = "phone_number")
	private String PhoneNumber;
	
	@Column(name = "isagreed")
	private boolean isAgreed;
	
	@Column(name = "isverified")
	private boolean isVerified;
	
	
	
	public User() {
		super();
	}

	
	
	public User(int userID, String firstName, String lastName, String email, String password, String userName,
			String qualification, String phoneNumber, boolean isAgreed, boolean isVerified) {
		super();
		UserID = userID;
		FirstName = firstName;
		LastName = lastName;
		this.email = email;
		this.password = password;
		UserName = userName;
		Qualification = qualification;
		PhoneNumber = phoneNumber;
		this.isAgreed = isAgreed;
		this.isVerified = isVerified;
	}



	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public boolean isAgreed() {
		return isAgreed;
	}
	public void setAgreed(boolean isAgreed) {
		this.isAgreed = isAgreed;
	}
	public boolean isVerified() {
		return isVerified;
	}
	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}
	
	

}
