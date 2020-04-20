package com.lti.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.lti.models.QuestionDetails;

public interface IQuestionDetailsRepository extends CrudRepository<QuestionDetails, Integer> { 

}
