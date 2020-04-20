package com.lti.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.models.QuestionDetails;
import com.lti.repository.IQuestionDetailsRepository;
import com.lti.repository.IQuestionDetailsRepositoryOne;
import com.lti.services.IQuestionDetailsService;

@Service
public class QuestionDetailsServiceImpl implements IQuestionDetailsService {

	@Autowired
	private IQuestionDetailsRepository iQuestionDetailsRepository;
	@Autowired
	private IQuestionDetailsRepositoryOne iQuestionDetailsRepositoryOne;
	

	@Override
	public List<QuestionDetails> findAllQuestionDetails() {
		List<QuestionDetails> users = new ArrayList<>();
		return iQuestionDetailsRepositoryOne.readAllQuestionDetails();
		
	}

	@Override
	public void addQuestionDetails(QuestionDetails questionDetails) {
		iQuestionDetailsRepository.save(questionDetails);
		
	}
	
	//Find the player
	public QuestionDetails getQuestion(int id) {
		Optional<QuestionDetails> question = iQuestionDetailsRepository.findById(id);
			if(question.isPresent()) {
				return question.get();
			}
		
		return null;
	}
	

}
