package com.lti.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.models.QuestionDetails;
import com.lti.models.UserFeedbackDetails;
import com.lti.repository.IUserFeedbackDetailsRepositoryOne;

@Repository
public class UserFeedbackDetailsRepositoryOneImpl implements IUserFeedbackDetailsRepositoryOne {
	
	
	@PersistenceContext
	@Autowired
	private EntityManager entityManager;
	
	
	
	@Override
	public List<UserFeedbackDetails> readAllUserFeedbackDetails() {
//		String jpql = "select q  "
//				+ " from QuestionDetails q inner join AnswerDetails a"
//				+ " join formDetails f "
//				+ " on q.questionDetailsId = a.id and q.questionDetailsId = f.formId";
		
		String jpql = "select u1 , r   from UserFeedbackDetails u1 join  Registration r "
				+ "on u1.email = r.email";
		
		Query q1=entityManager.createQuery(jpql);
		return q1.getResultList();
	
	}

	@Override
	public void createUserFeedbackDetails(UserFeedbackDetails userFeedbackDetails) {
		// TODO Auto-generated method stub

	}

}
