package com.techlabs.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;

public class AddAction extends ActionSupport implements Action{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String addName;
	private int addNumber;
	private String addAddress;
	private String post = "false";

	@Autowired
	ContactService contactService;

	@Override
	public void validate() {
		if (post.equals("true")) {
			if (addName.isEmpty()) {
				addFieldError("labelName", "Name is required");
			}
			if (addNumber == 0) {
				addFieldError("labelNumber", "Number is required");
			}
			if (addAddress.isEmpty()) {
				addFieldError("labelAddress", "Address is required");
			}
		}
	}

	@Override
	public String execute() throws Exception {
		System.out.println(post);
		System.out.println(addName+" "+addNumber+" "+addAddress);
		if (post.equals("false")) {
			return Action.SUCCESS;
		} else {
			Contact contact = new Contact(addName, addNumber, addAddress);
			contactService.addContact(contact);
			System.out.println(contact.getName());
			return Action.LOGIN;
		}

	}

	public String getAddName() {
		return addName;
	}

	public void setAddName(String addName) {
		this.addName = addName;
	}

	public int getAddNumber() {
		return addNumber;
	}

	public void setAddNumber(int addNumber) {
		this.addNumber = addNumber;
	}

	public String getAddAddress() {
		return addAddress;
	}

	public void setAddAddress(String addAddress) {
		this.addAddress = addAddress;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

}
