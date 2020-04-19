package com.lti.services;

import java.util.List;

import com.lti.models.FormDetails;

public interface IFormDetailsService {
public  List<FormDetails> findAllFormDetails();
	
	
	public void addFormDetails(FormDetails formDetails);
}
