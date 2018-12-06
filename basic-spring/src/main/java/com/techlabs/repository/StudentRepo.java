package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlabs.model.Student;

@Repository
public class StudentRepo {

	List<Student> students;

	public StudentRepo() {
		System.out.println("Student Repo Created");
		students = new ArrayList<>();
		students.add(new Student(101, "Dell", 87));
		students.add(new Student(102, "Moto", 89));
		students.add(new Student(103, "HP", 71));
	}

	public List<Student> getStudents() {
		return students;
	}

}
