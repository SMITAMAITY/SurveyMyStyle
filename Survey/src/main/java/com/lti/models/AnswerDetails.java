package com.lti.models;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	private Date updatedDate;

	private Time updatedTime;

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

	public AnswerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnswerDetails(int answerId, String answerDescription, Date createdDate, Time createdTime, String isActive,
			Date updatedDate, Time updatedTime) {
		super();
		this.answerId = answerId;
		this.answerDescription = answerDescription;
		this.createdDate = createdDate;
		this.createdTime = createdTime;
		this.isActive = isActive;
		this.updatedDate = updatedDate;
		this.updatedTime = updatedTime;
	}

	@Override
	public String toString() {
		return "AnswerDetails [answerId=" + answerId + ", answerDescription=" + answerDescription + ", createdDate="
				+ createdDate + ", createdTime=" + createdTime + ", isActive=" + isActive + ", updatedDate="
				+ updatedDate + ", updatedTime=" + updatedTime + "]";
	}

	
//	@ManyToOne
//	@JoinColumn(name="question_id")
//	private QuestionDetails questionDetails;


	
}
