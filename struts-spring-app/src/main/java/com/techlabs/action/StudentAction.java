package com.techlabs.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.StudentService;
import com.techlabs.viewmodel.StudentViewModel;

public class StudentAction implements Action, ModelDriven<StudentViewModel> {
	@Autowired
	StudentService service;
	StudentViewModel studentViewModel;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub

		return Action.SUCCESS;
	}

	@Override
	public StudentViewModel getModel() {
		// TODO Auto-generated method stub
		studentViewModel = new StudentViewModel();
		studentViewModel.setStudents(service.getAllStudent());
		studentViewModel.setCount(service.getAllStudent().size());
		return studentViewModel;
	}



}
