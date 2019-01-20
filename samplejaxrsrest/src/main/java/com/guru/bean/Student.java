package com.guru.bean;

public class Student {
	private int rollNum;
	private String name;
	private String address;

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
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

	public Student(int rollNum, String name, String address) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.address = address;
	}
	
	

}
