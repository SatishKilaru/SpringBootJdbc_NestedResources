package com.example.BookPublisherManager.models;

public class Publisher {
	private int publisher_id;
	private String name;
	private String address;
	private String phone_number;
	private String description;

	public Publisher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Publisher(int publisher_id, String name, String address, String phone_number, String description) {
		super();
		this.publisher_id = publisher_id;
		this.name = name;
		this.address = address;
		this.phone_number = phone_number;
		this.description = description;
	}

	public int getPublisher_id() {
		return publisher_id;
	}

	public void setPublisher_id(int publisher_id) {
		this.publisher_id = publisher_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
