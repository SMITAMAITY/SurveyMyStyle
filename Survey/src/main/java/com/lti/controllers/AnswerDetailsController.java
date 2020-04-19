package com.lti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.models.AnswerDetails;
import com.lti.services.impl.AnswerDetailsServiceImpl;

@RestController
public class AnswerDetailsController {
	@Autowired //how spring will know that it is a dependency
	private AnswerDetailsServiceImpl answerDetailsServiceImpl;
	
	@RequestMapping(value ="/AnswerDetails", method = RequestMethod.GET)
	public List<AnswerDetails> getPlayers(){
		return answerDetailsServiceImpl.findAllAnswerDetails();
	}
	
	@RequestMapping(value ="/AnswerDetails", method = RequestMethod.POST)
	public void savePlayer(@RequestBody AnswerDetails answerDetails) {
		answerDetailsServiceImpl.addAnswerDetails(answerDetails);
	}
}
