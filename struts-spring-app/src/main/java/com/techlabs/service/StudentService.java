package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.repository.StudentRepository;
import com.techlabs.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository repo;

	public StudentService() {
		// TODO Auto-generated constructor stub
	}

	public List<Student> getAllStudent() {
		return this.repo.getStudents();
	}
	
	public void addService(Student student) {
		this.repo.addStudents(student);
	}
}
