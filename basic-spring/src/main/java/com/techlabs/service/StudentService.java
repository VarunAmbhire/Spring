package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Student;
import com.techlabs.repository.StudentRepo;

@Service("studentService")
public class StudentService {

	@Autowired
	StudentRepo repo;

	public StudentService() {
		// TODO Auto-generated constructor stub
		System.out.println("Student Service Created");
	}
	
	public List<Student>getAllStudent(){
		return this.repo.getStudents();
	}
}
