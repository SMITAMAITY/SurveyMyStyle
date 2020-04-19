package com.lti.models;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="question_details")
public class QuestionDetails {
	
	@Id
	private int questionDetailsId;

	private Date createdDate;


	private Time createdTime;


	private int formId;

	private String isactive;

	private String questionDescription;


	private int questionSeqNo;

	private int questionTypeId;

	private Date updateDate;

	

	private Time updatedTime;

	//bi-directional many-to-one association to AnswerDetail
	
//	@OneToMany(mappedBy="questionsDetail")
//	private List<AnswerDetail> answerDetails;
	
//	@OneToMany(targetEntity=AnswerDetail.class, cascade=CascadeType.ALL)
//	@JoinColumn(name="id",referencedColumnName="questionDetailsId")
//	private List<AnswerDetail> answerDetails;
//
//
//	//bi-directional one-to-one association to QuestionType
	@OneToOne
	private QuestionType questionType;
//	


	//bi-directional many-to-one association to UserFeedbackDetail
	@OneToMany(targetEntity=UserFeedbackDetails.class, cascade=CascadeType.ALL)
	@JoinColumn(name="question_id",referencedColumnName="questionDetailsId")
	private List<UserFeedbackDetails> userFeedbackDetails;
	
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

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public String getQuestionDescription() {
		return questionDescription;
	}

	public void setQuestionDescription(String questionDescription) {
		this.questionDescription = questionDescription;
	}

	public int getQuestionSeqNo() {
		return questionSeqNo;
	}

	public void setQuestionSeqNo(int questionSeqNo) {
		this.questionSeqNo = questionSeqNo;
	}

	public int getQuestionTypeId() {
		return questionTypeId;
	}

	public void setQuestionTypeId(int questionTypeId) {
		this.questionTypeId = questionTypeId;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Time getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Time updatedTime) {
		this.updatedTime = updatedTime;
	}

	public QuestionType getQuestionType() {
		return questionType;
	}

	public void setQuestionType(QuestionType questionType) {
		this.questionType = questionType;
	}

	public List<UserFeedbackDetails> getUserFeedbackDetails() {
		return userFeedbackDetails;
	}

	public void setUserFeedbackDetails(List<UserFeedbackDetails> userFeedbackDetails) {
		this.userFeedbackDetails = userFeedbackDetails;
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

	public QuestionDetails(int questionDetailsId, Date createdDate, Time createdTime, int formId, String isactive,
			String questionDescription, int questionSeqNo, int questionTypeId, Date updateDate, Time updatedTime,
			QuestionType questionType, List<UserFeedbackDetails> userFeedbackDetails,
			List<AnswerDetails> answerDetails) {
		super();
		this.questionDetailsId = questionDetailsId;
		this.createdDate = createdDate;
		this.createdTime = createdTime;
		this.formId = formId;
		this.isactive = isactive;
		this.questionDescription = questionDescription;
		this.questionSeqNo = questionSeqNo;
		this.questionTypeId = questionTypeId;
		this.updateDate = updateDate;
		this.updatedTime = updatedTime;
		this.questionType = questionType;
		this.userFeedbackDetails = userFeedbackDetails;
		this.answerDetails = answerDetails;
	}

	@Override
	public String toString() {
		return "QuestionDetails [questionDetailsId=" + questionDetailsId + ", createdDate=" + createdDate
				+ ", createdTime=" + createdTime + ", formId=" + formId + ", isactive=" + isactive
				+ ", questionDescription=" + questionDescription + ", questionSeqNo=" + questionSeqNo
				+ ", questionTypeId=" + questionTypeId + ", updateDate=" + updateDate + ", updatedTime=" + updatedTime
				+ ", questionType=" + questionType + ", userFeedbackDetails=" + userFeedbackDetails + ", answerDetails="
				+ answerDetails + "]";
	}

	
	
	

	
	
	

	

}