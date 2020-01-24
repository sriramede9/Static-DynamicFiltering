package com.sri.Static.DynamicFiltering.model;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;

@XmlRootElement
public class User {

	private String name;
	private int id;
	
	@JsonIgnore
	private int phonenumber;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, int id, int phonenumber) {
		super();
		this.name = name;
		this.id = id;
		this.phonenumber = phonenumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", phonenumber=" + phonenumber + "]";
	}

}
