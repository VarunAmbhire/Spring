package com.techlabs.model;

public class Student {
	private int rollNo;
	private String name;
	private int score;

	public Student(int rollNo, String name, int score) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.score = score;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
