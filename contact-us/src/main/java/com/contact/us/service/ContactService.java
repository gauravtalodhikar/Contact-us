package com.contact.us.service;

import java.util.List;

import com.contact.us.entity.Contact;

public interface ContactService {
	List<Contact> getAllContacts();

	Contact saveContact(Contact contact);
	
	Contact getContactById(Long id);
	
	Contact updateContact(Contact contact);
	
	void deleteContactById(Long id);
}
