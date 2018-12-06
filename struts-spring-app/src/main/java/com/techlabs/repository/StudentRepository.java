package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlabs.model.Student;

@Repository
public class StudentRepository {

	List<Student> students=new ArrayList<>();
//
//	private static StudentRepository instance;
//
//	private StudentRepository() {
//	};

//	public static StudentRepository getInstance() {
//		// TODO Auto-generated constructor stub
//		if (instance == null) {
//			instance=new StudentRepository();
	public StudentRepository() {
//		students = new ArrayList<>();
		students.add(new Student(101, "DELL", 96));
		students.add(new Student(102, "Moto", 93));
		students.add(new Student(103, "HP", 85));
//		}
//		return instance;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void addStudents(Student student) {
		students.add(student);
		System.out.println(student.getRollNo()+" "+student.getName()+" Repo");
	}

}
