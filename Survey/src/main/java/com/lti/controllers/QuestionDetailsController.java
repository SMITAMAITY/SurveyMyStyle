package com.lti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.models.QuestionDetails;
import com.lti.services.IQuestionDetailsService;
import com.lti.services.impl.QuestionDetailsServiceImpl;

@RestController
@CrossOrigin
public class QuestionDetailsController {
	@Autowired //how spring will know that it is a dependency
	private QuestionDetailsServiceImpl questionDetailsService;
	
	@RequestMapping(value ="/QuestionDetails", method = RequestMethod.GET)
	public List<QuestionDetails> getPlayers(){
		return questionDetailsService.findAllQuestionDetails();
	}
	
	
	@RequestMapping(value ="/QuestionDetails/{id}")
	public QuestionDetails getPlayerById(@PathVariable int id) {
		return questionDetailsService.getQuestion(id);
	}
	
	@RequestMapping(value ="/QuestionDetails", method = RequestMethod.POST)
	public void savePlayer(@RequestBody QuestionDetails questionDetails) {
		questionDetailsService.addQuestionDetails(questionDetails);
	}
}
