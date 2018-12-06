package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.techlabs.model.Contact;

@Service
public class ContactService {
	List<Contact> contactList;

	public ContactService() {
		contactList = new ArrayList<>();
		Contact contact1 = new Contact("Varun", 123456, "India");
		Contact contact2 = new Contact("Price", 456789, "UK");
		Contact contact3 = new Contact("Shephard", 789, "USA");
		contactList.add(contact1);
		contactList.add(contact2);
		contactList.add(contact3);
	}

	public List<Contact> getContacts() {
		return contactList;
	}

	public void addContact(Contact contact) {
		contactList.add(contact);
	}

	public Contact getCont(int id) {
		return contactList.get(id);
	}

	public void update(int id, Contact contact) {
		contactList.set(id, contact);
	}

	public void delete(int id) {
		contactList.remove(id);
	}

}
