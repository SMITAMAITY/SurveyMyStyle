package com.lti.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.models.Registration;
import com.lti.repository.IRegistrationRepository;
import com.lti.services.IRegistrationService;

@Service
public class RegistrationServiceImpl implements IRegistrationService{
	
	
	@Autowired
	private IRegistrationRepository iRegistrationRepository;
	
	@Override
	public List<Registration> findAllRegistration() {
		List<Registration> users = new ArrayList<>();
		iRegistrationRepository.findAll().forEach(users::add);
		return users;
	}

	@Override
	public void addRegistration(Registration registration) {
		iRegistrationRepository.save(registration);
		
	}

}
