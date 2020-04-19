package com.lti.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.models.QuestionType;
import com.lti.repository.IQuestionTypeRepository;

@Service
public class QuestionTypeServiceImpl {
	@Autowired
	private IQuestionTypeRepository iQuestionTypeRepository;
	
	public List<QuestionType> findAllQuestionType() {
		List<QuestionType> users = new ArrayList<>();
		iQuestionTypeRepository.findAll().forEach(users::add);
		return users;
	}



	public void addQuestionType(QuestionType questionType) {
		iQuestionTypeRepository.save(questionType);
		
	}



	
}
