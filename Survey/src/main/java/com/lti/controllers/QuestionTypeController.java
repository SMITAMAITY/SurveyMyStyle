package com.lti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.models.QuestionType;
import com.lti.services.impl.QuestionTypeServiceImpl;

@RestController
public class QuestionTypeController {
	@Autowired //how spring will know that it is a dependency
	private QuestionTypeServiceImpl questionTypeServiceImpl;
	
	@RequestMapping(value ="/QuestionType", method = RequestMethod.GET)
	public List<QuestionType> getPlayers(){
		return questionTypeServiceImpl.findAllQuestionType();
	}
	
	@RequestMapping(value ="/QuestionType", method = RequestMethod.POST)
	public void savePlayer(@RequestBody QuestionType questionType) {
		questionTypeServiceImpl.addQuestionType(questionType);
	}
}
