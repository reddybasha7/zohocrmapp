package com.zoho.service;

import java.util.List;

import com.zoho.entity.Lead;

public interface LeadService {
	public void saveLeadInfo(Lead lead);
	
	public List<Lead> getAllLeads();

	public Lead findById(long id);

	public void deleteOneLead(long id);
}


