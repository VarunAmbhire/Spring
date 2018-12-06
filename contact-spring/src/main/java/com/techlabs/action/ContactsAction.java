package com.techlabs.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;

public class ContactsAction implements Action, SessionAware {
	private List<Contact> list;
	private boolean user;
	SessionMap<String, Object> map;
	
	@Autowired
	ContactService contactService;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		list = contactService.getContacts();
		user = (map.get("user")!=null);
		return Action.SUCCESS;
	}

	public List<Contact> getList() {
		return list;
	}

	public void setList(List<Contact> list) {
		this.list = list;
	}

	public boolean isUser() {
		return user;
	}

	public void setUser(boolean user) {
		this.user = user;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		map = (SessionMap<String, Object>) session;
	}

}
