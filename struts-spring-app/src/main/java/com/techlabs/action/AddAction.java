
package com.techlabs.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

public class AddAction implements Action, ModelDriven<Student> {

	@Autowired
	StudentService add;
	Student student = new Student();
	private String post = "false";

	@Override
	public Student getModel() {
		// TODO Auto-generated method stub
		return student;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if (post.equals("false")) {
			return Action.SUCCESS;
		} else {
			add.addService(student);
			System.out.println(student.getRollNo()+" "+student.getName());
			return Action.LOGIN;
		}
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

}
