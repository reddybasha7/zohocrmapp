package com.zoho.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entity.Billing;
import com.zoho.repositories.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {

		@Autowired
	private BillingRepository billingRepo;
	
	@Override
	public void generateInvoice(Billing billing) {
		billingRepo.save(billing);

	}

	@Override
	public List<Billing> listBilling() {
		List<Billing> bill = billingRepo.findAll();
		return bill;
		
	}

}
