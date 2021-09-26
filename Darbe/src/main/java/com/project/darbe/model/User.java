package com.project.darbe.model;


import java.util.Arrays;
import java.util.List;

import org.bson.types.Binary;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

// @Data // with @Data using lombok we don't need getters and setters. They are generated automatically
@Document(collection="UserDetails")
public class User {
	
	@Id
	private ObjectId id;
	private String firstname;
    private String lastname;
    private String email;
    private String password;
    private List<String> preferences;
//    private Binary profilepicture;
//    private Binary coverpicture;
//    private String tagline;
//    private String bio;
//    private String phone;
//    private int age;
    private String gender;
    private String zipcode;
    // private DayAndTime[] dayandtime;
    private List<DayAndtime> dayandtime;
    
   
    public User() {}


	public ObjectId getId() {
		return id;
	}


	public void setId(ObjectId id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
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


	public List<String> getPreferences() {
		return preferences;
	}


	public void setPreferences(List<String> preferences) {
		this.preferences = preferences;
	}



	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}


	public List<DayAndtime> getDayandtime() {
		return dayandtime;
	}


	public void setDayandtime(List<DayAndtime> dayandtime) {
		this.dayandtime = dayandtime;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", password=" + password + ", preferences=" + preferences + ", gender=" + gender + ", zipcode="
				+ zipcode + ", dayandtime=" + dayandtime + "]";
	}

 
       
}
