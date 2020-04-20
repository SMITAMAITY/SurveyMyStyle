package com.lti.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.models.QuestionDetails;
import com.lti.repository.IQuestionDetailsRepository;
import com.lti.repository.IQuestionDetailsRepositoryOne;


@Repository
public class QuestionDetailsRepositoryImpl implements IQuestionDetailsRepositoryOne {

	@PersistenceContext
	@Autowired
	private EntityManager entityManager;
	
	
	
	@Override
	public List<QuestionDetails> readAllQuestionDetails() {
//		String jpql = "select q  "
//				+ " from QuestionDetails q inner join AnswerDetails a"
//				+ " join formDetails f "
//				+ " on q.questionDetailsId = a.id and q.questionDetailsId = f.formId";
		
		String jpql = "select q from FormDetails";
		
		Query q1=entityManager.createQuery(jpql);
		return q1.getResultList();
	
	}

	@Override
	public void createQuestionDetails(QuestionDetails questionDetails) {
		// TODO Auto-generated method stub

	}

}
