package com.lti.models;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="question_type")
public class QuestionType {
	@Id
	private int questionTypeId;


	private Date createdDate;

	private Time createdTime;


	private String isActive;


	private String questionTypeDescription;

	private Date updatedDate;

	

	private Time updatedTime;

	//bi-directional one-to-one association to DynamicQuestion
//	@OneToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="question_type_id")
//	private DynamicQuestion dynamicQuestion;

	//bi-directional one-to-one association to QuestionsDetail
//	@OneToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="question_type_id",referencedColumnName="questionTypeId")
//	private QuestionDetails questionDetails;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="question_type_id")
	private QuestionDetails questionDetails;

	public int getQuestionTypeId() {
		return questionTypeId;
	}

	public void setQuestionTypeId(int questionTypeId) {
		this.questionTypeId = questionTypeId;
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

	public String getQuestionTypeDescription() {
		return questionTypeDescription;
	}

	public void setQuestionTypeDescription(String questionTypeDescription) {
		this.questionTypeDescription = questionTypeDescription;
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

	public QuestionDetails getQuestionDetails() {
		return questionDetails;
	}

	public void setQuestionDetails(QuestionDetails questionDetails) {
		this.questionDetails = questionDetails;
	}

	public QuestionType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuestionType(int questionTypeId, Date createdDate, Time createdTime, String isActive,
			String questionTypeDescription, Date updatedDate, Time updatedTime, QuestionDetails questionDetails) {
		super();
		this.questionTypeId = questionTypeId;
		this.createdDate = createdDate;
		this.createdTime = createdTime;
		this.isActive = isActive;
		this.questionTypeDescription = questionTypeDescription;
		this.updatedDate = updatedDate;
		this.updatedTime = updatedTime;
		this.questionDetails = questionDetails;
	}

	@Override
	public String toString() {
		return "QuestionType [questionTypeId=" + questionTypeId + ", createdDate=" + createdDate + ", createdTime="
				+ createdTime + ", isActive=" + isActive + ", questionTypeDescription=" + questionTypeDescription
				+ ", updatedDate=" + updatedDate + ", updatedTime=" + updatedTime + ", questionDetails="
				+ questionDetails + "]";
	}
	
	

}