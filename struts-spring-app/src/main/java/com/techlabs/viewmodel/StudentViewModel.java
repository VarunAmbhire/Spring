package com.techlabs.viewmodel;

import java.util.List;

import com.techlabs.model.Student;

public class StudentViewModel {
	private int count;
	private List<Student> students;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
