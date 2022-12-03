package com.zoho.service;

import java.util.List;

import com.zoho.entity.Billing;

public interface BillingService {
	public void generateInvoice(Billing billing);

	public List<Billing> listBilling();
}
