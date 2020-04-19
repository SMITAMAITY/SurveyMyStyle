package com.lti.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.models.FormDetails;
import com.lti.repository.IFormDetailsRepository;
import com.lti.services.IFormDetailsService;

@Service
public class FormDetailsServiceImpl implements IFormDetailsService {

	@Autowired
	private IFormDetailsRepository iFormDetailsRepository;
	
	@Override
	public List<FormDetails> findAllFormDetails() {
		List<FormDetails> users = new ArrayList<>();
		iFormDetailsRepository.findAll().forEach(users::add);
		return users;
	}

	@Override
	public void addFormDetails(FormDetails formDetails) {
		iFormDetailsRepository.save(formDetails);
	}

}
