package com.lti.services;

import java.util.List;

import com.lti.models.AnswerDetails;

public interface IAnswerDetailsService {
	public  List<AnswerDetails> findAllAnswerDetails();
	
	
	public void addAnswerDetails(AnswerDetails answerDetails);
}
