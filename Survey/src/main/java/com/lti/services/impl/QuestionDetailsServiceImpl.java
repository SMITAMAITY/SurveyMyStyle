package com.lti.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.models.QuestionDetails;
import com.lti.repository.IQuestionDetailsRepository;
import com.lti.services.IQuestionDetailsService;

@Service
public class QuestionDetailsServiceImpl implements IQuestionDetailsService {

	@Autowired
	private IQuestionDetailsRepository iQuestionDetailsRepository;
	

	@Override
	public List<QuestionDetails> findAllQuestionDetails() {
		List<QuestionDetails> users = new ArrayList<>();
		iQuestionDetailsRepository.findAll().forEach(users::add);
		return users;
	}

	@Override
	public void addQuestionDetails(QuestionDetails questionDetails) {
		iQuestionDetailsRepository.save(questionDetails);
		
	}

}
