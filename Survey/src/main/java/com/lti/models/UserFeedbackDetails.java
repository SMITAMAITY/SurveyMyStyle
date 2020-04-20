package com.lti.models;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_feedback_details")
public class UserFeedbackDetails {
	@Id
	private int userFeedbackDetailsId;
	
	private int questionDetailsId;
	
	private int answerId;

//	@Temporal(TemporalType.DATE)
	private Date createdDate;

	private Time createdTime;

	private String isActive;

//	@Temporal(TemporalType.DATE)
	private Date updatedDate;

	private Time updatedTime;
	
	private String email;

	public int getUserFeedbackDetailsId() {
		return userFeedbackDetailsId;
	}

	public void setUserFeedbackDetailsId(int userFeedbackDetailsId) {
		this.userFeedbackDetailsId = userFeedbackDetailsId;
	}

	public int getQuestionDetailsId() {
		return questionDetailsId;
	}

	public void setQuestionDetailsId(int questionDetailsId) {
		this.questionDetailsId = questionDetailsId;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserFeedbackDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserFeedbackDetails(int userFeedbackDetailsId, int questionDetailsId, int answerId, Date createdDate,
			Time createdTime, String isActive, Date updatedDate, Time updatedTime, String email) {
		super();
		this.userFeedbackDetailsId = userFeedbackDetailsId;
		this.questionDetailsId = questionDetailsId;
		this.answerId = answerId;
		this.createdDate = createdDate;
		this.createdTime = createdTime;
		this.isActive = isActive;
		this.updatedDate = updatedDate;
		this.updatedTime = updatedTime;
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserFeedbackDetails [userFeedbackDetailsId=" + userFeedbackDetailsId + ", questionDetailsId="
				+ questionDetailsId + ", answerId=" + answerId + ", createdDate=" + createdDate + ", createdTime="
				+ createdTime + ", isActive=" + isActive + ", updatedDate=" + updatedDate + ", updatedTime="
				+ updatedTime + ", email=" + email + "]";
	}
	
	
//	@ManyToOne
//	@JoinColumn(name="user_id")
//	private Registration registration;






	
}
