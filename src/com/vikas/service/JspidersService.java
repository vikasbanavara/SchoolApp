package com.vikas.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vikas.bean.School;
import com.vikas.bean.SchoolResource;
import com.vikas.bean.Student;
import com.vikas.bean.Teacher;
import com.vikas.dto.HelperSchool;
import com.vikas.dto.HelperStudent;
import com.vikas.dto.HelperTeacher;

@Path("/jsp")
public class JspidersService {

	private HelperSchool hsc = new HelperSchool();
	private HelperStudent hst = new HelperStudent();
	private HelperTeacher ht = new HelperTeacher();
	
	@POST
	@Path("/school")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String addSchool(School sc) {
		return hsc.addSchool(sc);
	}
	
	@GET
	@Path("/schools")
	@Produces(MediaType.APPLICATION_JSON)
	public List<School> getSchools() {
		return hsc.getAllSchool();
	}
	
	@POST
	@Path("/school/student")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public boolean addStudent(Student st) {
		return hst.addStudent(st);
	}
	
	@GET
	@Path("/school/students")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudents() {
		return hst.getStudents();
	}
	
	@POST
	@Path("/school/teacher")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public boolean addTeacher(Teacher t) {
		return ht.addTeacher(t);
	}
	
	@GET
	@Path("/school/teachers")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Teacher> getTeachers() {
		return ht.getTeachers();
	}
	
	@GET
	@Path("/schoolsResource")
	public List<SchoolResource> getSchoolResources() {
		return hsc.getSchoolResource();
	}
	
	
	
}
