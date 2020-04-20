package com.lti.models;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="question_details")
public class QuestionDetails {
	
	@Id
	private int questionDetailsId;

	private Date createdDate;


	private Time createdTime;


	private String isActive;

	private String questionDescription;

	private String questionSpecification;

	private int questionSeqNo;


	private Date updatedDate;

	

	private Time updatedTime;



//	@ManyToOne
//	@JoinColumn(name="question_type_id")
//	private QuestionType questionType;
//
//	@ManyToOne
//	@JoinColumn(name="form_id")
//	private FormDetails formDetails;


	
	@OneToMany(targetEntity=AnswerDetails.class, cascade=CascadeType.ALL)
	@JoinColumn(name="question_id",referencedColumnName="questionDetailsId")
	private List<AnswerDetails> answerDetails;



	public int getQuestionDetailsId() {
		return questionDetailsId;
	}



	public void setQuestionDetailsId(int questionDetailsId) {
		this.questionDetailsId = questionDetailsId;
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



	public String getQuestionDescription() {
		return questionDescription;
	}



	public void setQuestionDescription(String questionDescription) {
		this.questionDescription = questionDescription;
	}



	public String getQuestionSpecification() {
		return questionSpecification;
	}



	public void setQuestionSpecification(String questionSpecification) {
		this.questionSpecification = questionSpecification;
	}



	public int getQuestionSeqNo() {
		return questionSeqNo;
	}



	public void setQuestionSeqNo(int questionSeqNo) {
		this.questionSeqNo = questionSeqNo;
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



	


	public List<AnswerDetails> getAnswerDetails() {
		return answerDetails;
	}



	public void setAnswerDetails(List<AnswerDetails> answerDetails) {
		this.answerDetails = answerDetails;
	}



	public QuestionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}



	public QuestionDetails(int questionDetailsId, Date createdDate, Time createdTime, String isActive,
			String questionDescription, String questionSpecification, int questionSeqNo, Date updatedDate,
			Time updatedTime, List<AnswerDetails> answerDetails) {
		super();
		this.questionDetailsId = questionDetailsId;
		this.createdDate = createdDate;
		this.createdTime = createdTime;
		this.isActive = isActive;
		this.questionDescription = questionDescription;
		this.questionSpecification = questionSpecification;
		this.questionSeqNo = questionSeqNo;
		this.updatedDate = updatedDate;
		this.updatedTime = updatedTime;
		this.answerDetails = answerDetails;
	}



	@Override
	public String toString() {
		return "QuestionDetails [questionDetailsId=" + questionDetailsId + ", createdDate=" + createdDate
				+ ", createdTime=" + createdTime + ", isActive=" + isActive + ", questionDescription="
				+ questionDescription + ", questionSpecification=" + questionSpecification + ", questionSeqNo="
				+ questionSeqNo + ", updatedDate=" + updatedDate + ", updatedTime=" + updatedTime + ", answerDetails="
				+ answerDetails + "]";
	}










}
	

	
	
	

	

