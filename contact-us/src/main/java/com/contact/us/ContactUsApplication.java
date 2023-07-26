package com.contact.us;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.contact.us.entity.Contact;
import com.contact.us.repository.ContactRepository;

@SpringBootApplication
public class ContactUsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContactUsApplication.class, args);

	}

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

//		Contact contact1 = new Contact("Gaurav", "Talodhikar", "gaurav@gmail.com", "9765538461");
//		contactRepository.save(contact1);
//		Contact contact2 = new Contact("Gaurav1", "Talodhikar1", "gaurav1@gmail.com", "9765538462");
//		contactRepository.save(contact2);

	}

}
