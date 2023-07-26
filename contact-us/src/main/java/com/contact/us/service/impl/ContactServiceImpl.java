package com.contact.us.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.contact.us.entity.Contact;
import com.contact.us.repository.ContactRepository;
import com.contact.us.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	private ContactRepository contactRepository;

	public ContactServiceImpl(ContactRepository contactRepository) {
		super();
		this.contactRepository = contactRepository;
	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub

		return contactRepository.findAll();
	}

	@Override
	public Contact saveContact(Contact contact) {
		// TODO Auto-generated method stub

		return contactRepository.save(contact);
	}

	@Override
	public Contact getContactById(Long id) {
		// TODO Auto-generated method stub
		
		return contactRepository.findById(id).get();
	}

	@Override
	public Contact updateContact(Contact contact) {
		// TODO Auto-generated method stub
		
				
		return contactRepository.save(contact);
	}

	@Override
	public void deleteContactById(Long id) {
		// TODO Auto-generated method stub
		contactRepository.deleteById(id);
		
	}

}
