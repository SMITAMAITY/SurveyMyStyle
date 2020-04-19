package com.lti.repository;

import org.springframework.data.repository.CrudRepository;

import com.lti.models.UserFeedbackDetails;

public interface IUserFeedbackDetailsRepository extends CrudRepository<UserFeedbackDetails, Integer> {

}
