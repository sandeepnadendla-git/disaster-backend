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
@Table(name = "ReportIncident_tbl")
public class ReportIncident {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "report_id")
	private int reportID;
	
	@Column(name = "user_id")
	private int userID;

	
	@Column(name = "address")
	private String address;
	
	@Column(name = "city")
	private String city;
	
	
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "zip")
	private String zip;
	
	@Column(name = "longitude")
	private String longitude;
	
	@Column(name = "latitude")
	private String latitude;
	
	@Column(name = "images")
	private String images;
	
	@Column(name = "notes")
	private String notes;
	
	@Column(name = "casuality")
	private String casuality;
	
	@Column(name = "structural_damage")
	private String sDamage;
	
	
	@Column(name = "fire")
	private String Fire;
	
	@Column(name = "HAZMAT")
	private String HAZMAT;
	
	@Column(name = "Other")
	private String Other;
	
	 public ReportIncident() {
		 super();
	}

	public ReportIncident(int reportID, int userID, String address, String city, String state, String zip,
			String longitude, String latitude, String images, String notes, String casuality, String sDamage,
			String fire, String hAZMAT, String other) {
		super();
		this.reportID = reportID;
		this.userID = userID;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.longitude = longitude;
		this.latitude = latitude;
		this.images = images;
		this.notes = notes;
		this.casuality = casuality;
		this.sDamage = sDamage;
		Fire = fire;
		HAZMAT = hAZMAT;
		Other = other;
	}

	public int getReportID() {
		return reportID;
	}

	public void setReportID(int reportID) {
		this.reportID = reportID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getCasuality() {
		return casuality;
	}

	public void setCasuality(String casuality) {
		this.casuality = casuality;
	}

	public String getsDamage() {
		return sDamage;
	}

	public void setsDamage(String sDamage) {
		this.sDamage = sDamage;
	}

	public String getFire() {
		return Fire;
	}

	public void setFire(String fire) {
		Fire = fire;
	}

	public String getHAZMAT() {
		return HAZMAT;
	}

	public void setHAZMAT(String hAZMAT) {
		HAZMAT = hAZMAT;
	}

	public String getOther() {
		return Other;
	}

	public void setOther(String other) {
		Other = other;
	}

	

}
