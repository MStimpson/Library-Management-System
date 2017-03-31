package com.library;

public class Librarian {

	private int id;
	private String name;
	private String email;
	private String address;
	private String city;
	
	public Librarian(int id, String name, String email, String address, String city){
		this.id 	 = id;
		this.name  	 = name;
		this.email	 = email;
		this.address = address;
		this.city 	 = city;
	
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	
}
