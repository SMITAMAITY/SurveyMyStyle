package com.lti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.models.UserFeedbackDetails;
import com.lti.services.impl.UserFeedbackDetailsService;



@RestController
public class UserFeedbackDetailsController {
	
	@Autowired //how spring will know that it is a dependency
	private UserFeedbackDetailsService userFeedbackDetailsService;
	
	@RequestMapping(value ="/UserFeedbackDetails", method = RequestMethod.GET)
	public List<UserFeedbackDetails> getPlayers(){
		return userFeedbackDetailsService.findAllDetails();
	}
	
	@RequestMapping(value ="/UserFeedbackDetails", method = RequestMethod.POST)
	public void savePlayer(@RequestBody UserFeedbackDetails userFeedbackDetails) {
		userFeedbackDetailsService.addDetails(userFeedbackDetails);
	}

}
