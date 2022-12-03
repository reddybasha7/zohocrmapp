package com.zoho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zoho.entity.Contacts;
import com.zoho.service.ContactsService;

@Controller
public class ContactsController {

	@Autowired
	private ContactsService contactService;
	
	//http://localhost:8080/listContacts
		@RequestMapping("/listContacts")
		public String listAllContacts(Model model) {
			List<Contacts> contacts = contactService.getAllContacts();
			model.addAttribute("contacts", contacts);
			return "list_contacts";
			
		}
}
