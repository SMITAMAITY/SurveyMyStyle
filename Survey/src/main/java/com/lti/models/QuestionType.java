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

	
	@OneToMany(targetEntity=QuestionDetails.class, cascade=CascadeType.ALL)
	@JoinColumn(name="question_type_id",referencedColumnName="questionTypeId")
	private List<QuestionDetails> questionDetails;
//	
//	@OneToMany(mappedBy="questionType")
//	private List<QuestionDetails> questionDetails;

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

	public List<QuestionDetails> getQuestionDetails() {
		return questionDetails;
	}

	public void setQuestionDetails(List<QuestionDetails> questionDetails) {
		this.questionDetails = questionDetails;
	}

	public QuestionType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuestionType(int questionTypeId, Date createdDate, Time createdTime, String isActive,
			String questionTypeDescription, Date updatedDate, Time updatedTime, List<QuestionDetails> questionDetails) {
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