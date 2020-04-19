package com.lti.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.models.UserFeedbackDetails;
import com.lti.repository.IUserFeedbackDetailsRepository;
import com.lti.services.IUserFeedbackDetailsService;

@Service
public class UserFeedbackDetailsService implements IUserFeedbackDetailsService {
	
	@Autowired
	private IUserFeedbackDetailsRepository iUserFeedbackDetailsRepository;
	
	@Override
	public List<UserFeedbackDetails> findAllDetails() {
		List<UserFeedbackDetails> users = new ArrayList<>();
		iUserFeedbackDetailsRepository.findAll().forEach(users::add);
		return users;
	}

	@Override
	public void addDetails(UserFeedbackDetails userFeedbackDetails) {
		iUserFeedbackDetailsRepository.save(userFeedbackDetails);
		
	}

}
