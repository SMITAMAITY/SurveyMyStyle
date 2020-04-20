package com.lti.repository;

import java.util.List;

import com.lti.models.QuestionDetails;

public interface IQuestionDetailsRepositoryOne {


	//Select details
	public List<QuestionDetails> readAllQuestionDetails();
	
	
	//Insert details
	public void createQuestionDetails(QuestionDetails questionDetails);
}
