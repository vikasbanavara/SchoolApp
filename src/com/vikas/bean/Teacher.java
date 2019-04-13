package com.vikas.bean;

public class Teacher {
	private int id;
	private String name;
	private String[] subjects;
	
	public Teacher() {
		
	}
	
	public Teacher(int id, String name, String[] subjects) {
		this.id = id;
		this.name = name;
		this.subjects = subjects;
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
	public String[] getSubjects() {
		return subjects;
	}
	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}
	
	
}
