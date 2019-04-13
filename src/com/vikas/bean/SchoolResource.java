package com.vikas.bean;

public class SchoolResource extends School {
	
	private String studentURL;
	private String teacherURL;
	
	public SchoolResource() {
		
	}
	
	public SchoolResource(String studentURL, String teacherURL) {
		this.studentURL = studentURL;
		this.teacherURL = teacherURL;
	}
	public String getStudentURl() {
		return this.studentURL;
	}
	public void setStudentURl(String studentURL) {
		this.studentURL = studentURL;
	}
	public String getTeacherURL() {
		return teacherURL;
	}
	public void setTeacherURL(String teacherURL) {
		this.teacherURL = teacherURL;
	}
	
	
	

}
