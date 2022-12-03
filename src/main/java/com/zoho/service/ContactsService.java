package com.zoho.service;

import java.util.List;

import com.zoho.entity.Contacts;

public interface ContactsService {
	public void saveContactInfo(Contacts contacts);
	
	public List<Contacts> getAllContacts();

	public Contacts findContactsById(long id);

}


