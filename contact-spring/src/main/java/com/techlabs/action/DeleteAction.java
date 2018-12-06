package com.techlabs.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.service.ContactService;

public class DeleteAction implements Action {

	@Autowired
	ContactService contactService;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		int index = Integer.parseInt(ServletActionContext.getRequest().getParameter("index"));
		contactService.delete(index);

		return Action.SUCCESS;
	}

}
