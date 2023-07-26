package com.contact.us.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.contact.us.entity.Contact;
import com.contact.us.service.ContactService;

@Controller
public class ContactController {
	private ContactService contactService;

	public ContactController(ContactService contactService) {
		super();
		this.contactService = contactService;
	}

	// Handler method to handle the list of contacts and return and view
	@GetMapping("/contacts")
	public String listContacts(Model model) {
		model.addAttribute("contacts", contactService.getAllContacts());
		return "contacts";
	}

	@GetMapping("/contacts/new")
	public String createContactForm(Model model) {
//		Create Contact detail 
		Contact contact = new Contact();
		model.addAttribute("contact", contact);
		return "create_contact";

	}

	@PostMapping("/contacts")
	public String saveContact(@ModelAttribute("contact") Contact contact) {
		contactService.saveContact(contact);
		return "redirect:/contacts";
	}
	
	@GetMapping("/contacts/edit/{id}")
	public String editContactForm(@PathVariable Long id, Model model) {
		model.addAttribute("contact", contactService.getContactById(id));
		return "edit_contact";
	}
	
	@PostMapping("/contacts/{id}")
	public String updateContact(@PathVariable Long id,
			@ModelAttribute("contact") Contact contact,
			Model model) {
//		get student from database by id 
		Contact existingContact = contactService.getContactById(id);
		existingContact.setId(id);
		existingContact.setFirstname(contact.getFirstname());
		existingContact.setLastname(contact.getLastname());
		existingContact.setEmail(contact.getEmail());
		existingContact.setMoblieno(contact.getMoblieno());
		
//		Save the updated object 
		contactService.updateContact(existingContact);
		return "redirect:/contacts" ;
	}

//	Handler method to handle delete data
	
	@GetMapping("/contacts/{id}")
	public String deleteContact(@PathVariable Long id ) {
		contactService.deleteContactById(id);
		return "redirect:/contacts";
	}
}
