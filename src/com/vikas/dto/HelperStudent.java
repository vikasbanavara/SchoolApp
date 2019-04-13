package com.vikas.dto;

import java.util.ArrayList;
import java.util.List;

import com.vikas.bean.Student;

public class HelperStudent {
	private static ArrayList<Student> al = new ArrayList<Student>();
	
	public boolean addStudent(Student st) {
		return al.add(st);
	}
	
	public List<Student> getStudents() {
		return al;
	}
}
