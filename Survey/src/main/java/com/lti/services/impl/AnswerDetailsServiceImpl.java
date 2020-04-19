package com.lti.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.models.AnswerDetails;
import com.lti.models.FormDetails;
import com.lti.repository.IAnswerDetailsRepository;
import com.lti.repository.IFormDetailsRepository;
import com.lti.services.IAnswerDetailsService;

@Service
public class AnswerDetailsServiceImpl implements IAnswerDetailsService {

	@Autowired
	private IAnswerDetailsRepository iAnswerDetailsRepository;
	
	@Override
	public List<AnswerDetails> findAllAnswerDetails() {
		List<AnswerDetails> users = new ArrayList<>();
		iAnswerDetailsRepository.findAll().forEach(users::add);
		return users;
	}

	@Override
	public void addAnswerDetails(AnswerDetails answerDetails) {
		iAnswerDetailsRepository.save(answerDetails);
		
	}

}
