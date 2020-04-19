package com.lti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.models.Registration;
import com.lti.services.impl.RegistrationServiceImpl;

@RestController
public class RegistrationController {
	
	@Autowired //how spring will know that it is a dependency
	private RegistrationServiceImpl registrationService;
	
	@RequestMapping(value ="/Registration", method = RequestMethod.GET)
	public List<Registration> getPlayers(){
		return registrationService.findAllRegistration();
	}
	
	@RequestMapping(value ="/Registration", method = RequestMethod.POST)
	public void savePlayer(@RequestBody Registration registration) {
		registrationService.addRegistration(registration);
	}
}
