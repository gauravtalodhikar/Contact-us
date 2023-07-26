package com.contact.us.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contact.us.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
