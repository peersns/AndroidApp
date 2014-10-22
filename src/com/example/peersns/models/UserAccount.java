package com.example.peersns.models;

import com.parse.ParseObject;

public class UserAccount extends ParseObject{
	//private String username;
//	private String id;
//	
//	private String firstName;
//	private String lastName;
//	private String email;
//	private String password;
//	private Integer zip;
//	private String city;
//	//Optional params
//	private Integer phone;
//	private String address;
//	private String state;
//	private String country;
	
	private UserAccount(String firstName, String lastName, String email, String password, Integer zip,
			String city, Integer phone, String address, String state,
			String country) {
		//generate id
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setPassword(password);
		setZip(zip);
		//optional
//		setCity(city);
//		setPhone(phone);
//		setAddress(address);
//		setState(address);
//		setCountry(country);
		// TODO Auto-generated constructor stub
	}

	public void setFirstName(String firstName) {
		//Add validation
		//this.firstName = firstName;
		put("firstname",firstName);
	}

	public void setLastName(String lastName) {
		//Add validation
		//this.lastName = lastName;
		put("lastName",lastName);
	}
	public void setEmail(String email) {
		//Add validation
		//this.email = email;
		put("email",email);
	}

	public void setPassword(String password) {
		//Add validation
		//this.password = password;
		put("password",password);
	}

	public void setZip(Integer zip) {
		//Add validation
		//this.zip = zip;
		put("zip",zip);
	}
//
//	public void setCity(String city) {
//		//Add validation
//		this.city = city;
//	}
//
//	public void setPhone(Integer phone) {
//		//Add validation
//		this.phone = phone;
//	}
//
//	public void setAddress(String address) {
//		//Add validation
//		this.address = address;
//	}
//
//	public void setState(String state) {
//		//Add validation
//		this.state = state;
//	}
//
//	public void setCountry(String country) {
//		//Add validation
//		this.country = country;
//	}
	
	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public Integer getZip() {
		return zip;
	}

	public String getCity() {
		return city;
	}

	public Integer getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public String getState() {
		return state;
	}
	
	public String getCountry() {
		return country;
	}
	
    public static class UserAccountBuilder {
    	//private String username;
    	private String id;
    	private String firstName;
    	private String lastName;
    	private String email;
    	private String password;
    	private Integer zip;
    	private String city;
    	//Optional params
    	private Integer phone;
    	private String address;
    	private String state;
    	private String country;
    	
    	public UserAccount build(){
    		UserAccount userAccount = new UserAccount(firstName, lastName, email, password, zip, city, phone, address, state, country);
    		return userAccount;
    	}
    	
    	public UserAccountBuilder setFirstName(String firstName){
    		this.firstName = firstName;
    		return this;
    	}
    	
    	public UserAccountBuilder setLastName(String lastName){
    		this.lastName = lastName;
    		return this;
    	}
    	
    	public UserAccountBuilder setEmail(String email){
    		this.email = email;
    		return this;
    	}

    	public UserAccountBuilder setPassword(String password) {
    		this.password = password;
    		return this;
    	}

    	public UserAccountBuilder setZip(Integer zip) {
    		this.zip = zip;
    		return this;
    	}

    	public UserAccountBuilder setCity(String city) {
    		this.city = city;
    		return this;
    	}

    	public UserAccountBuilder setPhone(Integer phone) {
    		this.phone = phone;
    		return this;
    	}

    	public UserAccountBuilder setAddress(String address) {
    		this.address = address;
    		return this;
    	}

    	public UserAccountBuilder setState(String state) {
    		this.state = state;
    		return this;
    	}
    	
    	public UserAccountBuilder setCountry(String country) {
    		this.country = country;
    		return this;
    	}
    }
}
