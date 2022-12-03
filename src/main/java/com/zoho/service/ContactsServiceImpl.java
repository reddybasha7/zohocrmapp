package com.zoho.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entity.Contacts;
import com.zoho.entity.Lead;
import com.zoho.repositories.ContactsRepository;
import com.zoho.repositories.LeadRepository;
@Service
public class ContactsServiceImpl implements ContactsService {

	@Autowired
	private ContactsRepository contactRepo;

	@Override
	public void saveContactInfo(Contacts contacts) {
		contactRepo.save(contacts);
	}

	@Override
	public List<Contacts> getAllContacts() {
		List<Contacts> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contacts findContactsById(long id) {
		Optional<Contacts> findById = contactRepo.findById(id);
		Contacts contacts = findById.get();
		return contacts;
	}
	
	

}
