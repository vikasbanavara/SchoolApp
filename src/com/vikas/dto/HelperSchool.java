package com.vikas.dto;

import java.util.ArrayList;
import java.util.List;

import com.vikas.bean.School;
import com.vikas.bean.SchoolResource;

public class HelperSchool {
	
	private static ArrayList<School> al = new ArrayList<School>();

	public String addSchool(School sc) {
		boolean res =  al.add(sc);
		if(res == true){
			return "Inserted the School";
		} else {
			return "Failed to insert the School";
		}
	}
	
	public List<School> getAllSchool() {
		return al;
	}
	
	public List<SchoolResource> getSchoolResource() {
	
		ArrayList<SchoolResource> als = new ArrayList<SchoolResource>();
		for(int i=0;i<al.size();i++) {
			SchoolResource sc = new SchoolResource();
			School s = al.get(i);
			
			sc.setId(s.getId());
			sc.setName(s.getName());
			sc.setStudentURl("/school/students");
			sc.setTeacherURL("/school/teachers");
			als.add(sc);
		}
		return als;
	}
}
