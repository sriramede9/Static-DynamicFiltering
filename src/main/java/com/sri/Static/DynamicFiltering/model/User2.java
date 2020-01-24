package com.sri.Static.DynamicFiltering.model;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter(value = "customfilter")

public class User2 {
	
	private int id;
	private String name;
	private int phoneNumber;
	
	public User2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User2(int id, String name, int phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "User2 [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
	
	

}
