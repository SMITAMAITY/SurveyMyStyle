package com.lti.services;

import java.util.List;

import com.lti.models.QuestionType;

public interface IQuestionTypeService {
	public  List<QuestionType> findAllQuestionType();
	
	
	public void addQuestionType(QuestionType questionType);
}
