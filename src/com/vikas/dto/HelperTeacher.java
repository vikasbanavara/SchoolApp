package com.vikas.dto;

import java.util.ArrayList;
import java.util.List;

import com.vikas.bean.Teacher;

public class HelperTeacher {
private static ArrayList<Teacher> al = new ArrayList<Teacher>();
	
	public boolean addTeacher(Teacher st) {
		return al.add(st);
	}
	
	public List<Teacher> getTeachers() {
		return al;
	}
}
