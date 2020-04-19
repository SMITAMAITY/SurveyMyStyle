package com.lti.models;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="answer_details")
public class AnswerDetails {

	@Id
	private int answerId;


	private String answerDescription;



	private Date createdDate;

	private Time createdTime;


	private String isActive;


	private String questionType;


	private Date updatedDate;

	private Time updatedTime;

	//bi-directional many-to-one association to DynamicQuestion
//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="question_details_id")
//	private DynamicQuestion dynamicQuestion;

	//bi-directional many-to-one association to QuestionsDetail
//	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
//	@JoinColumn(name="question_details_id")
//	private QuestionsDetail questionsDetail;
	

	//bi-directional many-to-one association to UserFeedbackDetail
//	@OneToMany(mappedBy="answerDetail")
//	private List<UserFeedbackDetail> userFeedbackDetails;

	@OneToMany(targetEntity=UserFeedbackDetails.class, cascade=CascadeType.ALL)
	@JoinColumn(name="answer_id",referencedColumnName="answerId")
	private List<UserFeedbackDetails> userFeedbackDetails;
	
//	@ManyToOne(targetEntity=QuestionDetails.class, cascade=CascadeType.ALL)
//	@JoinColumn(name="answer_id",referencedColumnName="answerId")
//	private List<QuestionDetails> questionDetails;

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswerDescription() {
		return answerDescription;
	}

	public void setAnswerDescription(String answerDescription) {
		this.answerDescription = answerDescription;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Time getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Time createdTime) {
		this.createdTime = createdTime;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Time getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Time updatedTime) {
		this.updatedTime = updatedTime;
	}

	public List<UserFeedbackDetails> getUserFeedbackDetails() {
		return userFeedbackDetails;
	}

	public void setUserFeedbackDetails(List<UserFeedbackDetails> userFeedbackDetails) {
		this.userFeedbackDetails = userFeedbackDetails;
	}

//	public List<QuestionDetails> getQuestionDetails() {
//		return questionDetails;
//	}
//
//	public void setQuestionDetails(List<QuestionDetails> questionDetails) {
//		this.questionDetails = questionDetails;
//	}

	public AnswerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnswerDetails(int answerId, String answerDescription, Date createdDate, Time createdTime, String isActive,
			String questionType, Date updatedDate, Time updatedTime, List<UserFeedbackDetails> userFeedbackDetails) {
		super();
		this.answerId = answerId;
		this.answerDescription = answerDescription;
		this.createdDate = createdDate;
		this.createdTime = createdTime;
		this.isActive = isActive;
		this.questionType = questionType;
		this.updatedDate = updatedDate;
		this.updatedTime = updatedTime;
		this.userFeedbackDetails = userFeedbackDetails;
//		this.questionDetails = questionDetails;
	}

	@Override
	public String toString() {
		return "AnswerDetails [answerId=" + answerId + ", answerDescription=" + answerDescription + ", createdDate="
				+ createdDate + ", createdTime=" + createdTime + ", isActive=" + isActive + ", questionType="
				+ questionType + ", updatedDate=" + updatedDate + ", updatedTime=" + updatedTime
				+ ", userFeedbackDetails=" + userFeedbackDetails + "]";
	}
	
	
}
