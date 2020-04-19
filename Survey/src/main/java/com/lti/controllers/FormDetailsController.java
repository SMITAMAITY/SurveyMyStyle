package com.lti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.models.FormDetails;
import com.lti.services.impl.FormDetailsServiceImpl;

@RestController
@CrossOrigin
public class FormDetailsController {
	@Autowired //how spring will know that it is a dependency
	private FormDetailsServiceImpl formDetailsServiceImpl;
	
	@RequestMapping(value ="/FormDetails", method = RequestMethod.GET)
	public List<FormDetails> getPlayers(){
		return formDetailsServiceImpl.findAllFormDetails();
	}
	
	@RequestMapping(value ="/FormDetails", method = RequestMethod.POST)
	public void savePlayer(@RequestBody FormDetails formDetails) {
		formDetailsServiceImpl.addFormDetails(formDetails);
	}
}
