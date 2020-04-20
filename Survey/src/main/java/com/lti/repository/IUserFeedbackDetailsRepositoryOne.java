package com.lti.repository;

import java.util.List;

import com.lti.models.UserFeedbackDetails;

public interface IUserFeedbackDetailsRepositoryOne {


	//Select details
	public List<UserFeedbackDetails> readAllUserFeedbackDetails();
	
	
	//Insert details
	public void createUserFeedbackDetails(UserFeedbackDetails userFeedbackDetails);
}
