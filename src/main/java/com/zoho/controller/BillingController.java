package com.zoho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.entity.Billing;
import com.zoho.entity.Contacts;
import com.zoho.service.BillingService;
import com.zoho.service.ContactsService;

@Controller
public class BillingController {
	
	@Autowired
	private ContactsService contactService;
	
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/billingForm")
	public String viewBillingForm(@RequestParam("contactId") long id, Model model) {
		Contacts contact = contactService.findContactsById(id);
		model.addAttribute("contact", contact);
		return "create_bill";
	}
	
	@RequestMapping("/generateBill")
	public String generateBill(@ModelAttribute("billing")Billing billing) {
		billingService.generateInvoice(billing);
		return "create_bill";
	}
	
	//http://localhost:8080/listBills
	@RequestMapping("/listBills")
	public String listBillings( Model model) {
		List<Billing> bill = billingService.listBilling();
		model.addAttribute("bill", bill);
		return "list_bills";
	}
	
}
